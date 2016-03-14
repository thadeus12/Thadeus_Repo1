package com.leo.apollo.qa.support

/**
 * Created by charles.moga on 05/01/2016.
 */
import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement
import java.sql.ResultSet

this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

class World {}

World() {
    // By delegating World to SharedWorld, we can see it in other step files
    new SharedWorld()
}

class SharedWorld {
    def helpers = new Helpers()
    def db = new Db()
}

class Db {
    Connection connection = null
    Statement stmt = null

    def openConnection() {
        def jenkins = System.properties['jenkins']
        def dbUser = jenkins?"devadmin":"root"
        def dbPwd = jenkins?"F@stzL43":"L30.pass"
        try {
            Class.forName("com.mysql.jdbc.Driver")
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/apollo", dbUser, dbPwd)
            stmt = connection.createStatement()
        }
        catch (Exception e) {
            e.printStackTrace()
        }
    }

    def closeConnection() {
        try {
            stmt.close()
            connection.close()
        } catch (Exception e) {
            e.printStackTrace()
        }
    }

    int createAgent(def basicInfo, def commission) {
        basicInfo.name
    }

    int createAgent(String data) {
        int id = 0
        openConnection()
        String[] values = data.split("\\|")

        try {
            String sql = "insert into user (name,password,is_master,owner_id,level_id,status_id,first_name,last_name,contact_no,created_date,is_loggedin) "
            sql += "values (" + values[0] + ")"
            stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS)
            ResultSet rs = stmt.getGeneratedKeys()
            if (rs.next()) {
                id = rs.getInt(1)
            }
            rs.close()

            if (id > 0) {
                sql = "insert into account (user_id,credit_limit,max_agent_credit,max_member_credit,available_balance,outstanding_bal,yday_outstanding_bal,cash_bal,yday_cash_bal,total_bal,yday_total_bal) "
                sql += " values (" + id + "," + values[1] + ")"
                stmt.execute(sql)

                sql = "insert into bet_settings_model (sport_id,user_id,parent_user_id,min_bet,max_bet,max_per_match) values "
                sql += "(1," + id + "," + values[2] + "),"
                sql += "(2," + id + "," + values[2] + "),"
                sql += "(3," + id + "," + values[2] + ")"
                stmt.execute(sql)

                sql = "insert into pos_taking_model (group_id,user_id,parent_user_id,parent_auto_position,parent_position,max_dl_position) values "
                sql += "(1," + id + "," + values[3] + "),"
                sql += "(2," + id + "," + values[3] + "),"
                sql += "(3," + id + "," + values[3] + ")"
                stmt.execute(sql)

                sql = "insert into commission (commission_group_id,user_id,parent_id,commission,member_commission) values "
                sql += "(1," + id + "," + values[4] + "),"
                sql += "(2," + id + "," + values[4] + "),"
                sql += "(3," + id + "," + values[4] + ")"
                stmt.execute(sql)
            }
        }
        catch (Exception e) {
            e.printStackTrace()
        } finally {
            try {
                stmt.close()
                connection.close()
            } catch (Exception e) {
                e.printStackTrace()
            }
        }
        closeConnection()
        return id
    }

    int createAgentWithOpenBets(String data) {
        int id = 0
        openConnection()
        String[] values = data.split("\\|")

        try {
            String sql = "insert into user (name,password,is_master,owner_id,level_id,status_id,first_name,last_name,contact_no,created_date,is_loggedin) "
            sql += "values (" + values[0] + ")"
            stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS)
            ResultSet rs = stmt.getGeneratedKeys()
            if (rs.next()) {
                id = rs.getInt(1)
            }
            rs.close()

            if (id > 0) {
                sql = "insert into account (user_id,credit_limit,max_agent_credit,max_member_credit,available_balance,outstanding_bal,yday_outstanding_bal,cash_bal,yday_cash_bal,total_bal,yday_total_bal,open_bet_count) "
                sql += " values (" + id + "," + values[1] + ")"
                stmt.execute(sql)

                sql = "insert into bet_settings_model (sport_id,user_id,parent_user_id,min_bet,max_bet,max_per_match) values "
                sql += "(1," + id + "," + values[2] + "),"
                sql += "(2," + id + "," + values[2] + "),"
                sql += "(3," + id + "," + values[2] + ")"
                stmt.execute(sql)

                sql = "insert into pos_taking_model (group_id,user_id,parent_user_id,parent_auto_position,parent_position,max_dl_position) values "
                sql += "(1," + id + "," + values[3] + "),"
                sql += "(2," + id + "," + values[3] + "),"
                sql += "(3," + id + "," + values[3] + ")"
                stmt.execute(sql)

                sql = "insert into commission (commission_group_id,user_id,parent_id,commission,member_commission) values "
                sql += "(1," + id + "," + values[4] + "),"
                sql += "(2," + id + "," + values[4] + "),"
                sql += "(3," + id + "," + values[4] + ")"
                stmt.execute(sql)
            }
        }
        catch (Exception e) {
            e.printStackTrace()
        } finally {
            try {
                stmt.close()
                connection.close()
            } catch (Exception e) {
                e.printStackTrace()
            }
        }
        closeConnection()
        return id
    }

    def deleteAgent(String[] usernames) {
        String str = "("
        for (int i = 0; i < usernames.length; i++) {
            str += "'" + usernames[i] + "',"
        }
        String whereClause = str.substring(0, str.length() - 1)
        whereClause += ")"
        try {
            openConnection()

            String query = "delete from account where user_id in ("
            query += "select id from user where name in " + whereClause + ")"
            stmt.execute(query)

            query = "delete from bet_settings_model where user_id in ("
            query += "select id from user where name in " + whereClause + ")"
            stmt.execute(query)

            query = "delete from pos_taking_model where user_id in ("
            query += "select id from user where name in " + whereClause + ")"
            stmt.execute(query)
            query = "delete from commission where user_id in ("
            query += "select id from user where name in " + whereClause + ")"
            stmt.execute(query)

            query = "delete from user where name in " + whereClause
            stmt.execute(query)

            closeConnection()
        }
        catch (Exception e) {
            System.out.println(e)
        }
    }

    int getUserId(String username) {
        int id = 0
        try {
            openConnection()

            String query = "select id from user where name='" + username + "'"
            ResultSet rs = stmt.executeQuery(query)
            while (rs.next()) {
                id = rs.getInt("id")
            }
            rs.close()

            closeConnection()
        }
        catch (Exception e) {
            System.out.println(e)
        }
        return id
    }
    double getAvailableBalance(String username) {
        double balance = 0
        try {
            openConnection()

            String query = "select available_balance from account where user_id = (select id from user where name='" + username + "')"
            ResultSet rs = stmt.executeQuery(query)
            while (rs.next()) {
                balance = rs.getDouble("available_balance")
            }
            rs.close()

            closeConnection()
        }
        catch (Exception e) {
            System.out.println(e)
        }
        return balance
    }

    double getLiability(String username){
        double liability=0
        try{
            openConnection()

            String query="select unmatched_liability from account where user_id=(select id from user where name='" + username + "')"
            ResultSet rs = stmt.executeQuery(query)
            while (rs.next()) {
                liability = rs.getDouble("unmatched_liability")
            }
            rs.close()

            closeConnection()
        }
        catch (Exception e) {
            System.out.println(e)
        }
        return liability
    }






    def Map<String,String> readUser(String username){
        Map user = new HashMap<>()

        Map levels = new HashMap<>()
        levels.put(10,"SMA")
        levels.put(20,"MA")
        levels.put(30,"Agent")
        levels.put(40,"Member")

        Map status = new HashMap<>()
        status.put(1,"ACTIVE")
        status.put(2, "INACTIVE")
        status.put(3, "SUSPENDED")
        status.put(4, "CLOSED")

        String query = "select * from user where name='"+username+"' limit 1"
        try{
            openConnection()

            ResultSet rs = stmt.executeQuery(query)

            while (rs.next()) {
                user.put("id", rs.getInt("id"))
                user.put("level", levels.get(rs.getInt("level_id")))
                user.put("status", status.get(rs.getInt("status_id")))
                user.put("firstName", rs.getString("first_name"))
                user.put("lastName", rs.getString("last_name"))
                user.put("contactNumber", rs.getString("contact_no"))
                user.put("master", rs.getInt("is_master"))
                user.put("owner", rs.getInt("owner_id"))
            }

            closeConnection()
        }catch (Exception e)
        {
            System.err.println(e.getMessage())
        }
        return user
    }
    def String readDownlines(String username,String searchCode,int searchStatus){

        String query  = "SELECT *, (CASE WHEN status_id=4 THEN 99 ELSE 1 end) order_status "
        query += "FROM user WHERE owner_id = (select id from user where name='"+username+"') "
        query += "AND is_master=1 AND name LIKE '%"+searchCode+"%' "
        query += "AND CASE WHEN "+searchStatus+" > 0 THEN status_id = "+searchStatus+" ELSE 1 = 1 END "
        query += "ORDER BY order_status, name"

        ArrayList<String> downlines = new ArrayList<>()
        try{
            openConnection()

            ResultSet rs = stmt.executeQuery(query)

            while (rs.next()) {
                downlines.add(rs.getString("name"))
            }

            closeConnection()
        }catch (Exception e)
        {
            System.err.println(e.getMessage())
        }
        return downlines.toString()
    }
    def Map<String,String> readCredits(String username){
        Map account = new HashMap<>()

        String query = "select * from account where user_id =(select id from user where name='"+username+"' limit 1)"
        System.out.println(query)
        try{
            openConnection()

            ResultSet rs = stmt.executeQuery(query)

            while (rs.next()) {
                account.put("creditLimit", rs.getInt("credit_limit"))
                account.put("maxAgentCredit", rs.getInt("max_agent_credit"))
                account.put("maxMemberCredit", rs.getInt("max_member_credit"))
            }

            closeConnection()
        }catch (Exception e)
        {
            System.err.println(e.getMessage())
        }
        return account
    }
    def Map<String,String> readBettings(String username, int sportid){
        Map bettings = new HashMap<>()

        String query = "select * from bet_settings_model where sport_id = "+sportid+" and user_id =(select id from user where name='"+username+"' limit 1)"
        System.out.println(query)
        try{
            openConnection()

            ResultSet rs = stmt.executeQuery(query)

            while (rs.next()) {
                bettings.put("minBet", rs.getInt("min_bet"))
                bettings.put("maxBet", rs.getInt("max_bet"))
                bettings.put("maxPerMatch", rs.getInt("max_per_match"))
            }

        }catch (Exception e) {
            System.err.println(e.getMessage())
        } finally {
            closeConnection()
        }
        return bettings
    }

    def update(String query) {
        try {
            openConnection()
            stmt.executeUpdate(query)
        } catch(Exception e) {
            System.err.println(e.getMessage())
        } finally {
            closeConnection()
        }
    }

    def Map<String,String> readPositionTakings(String username, int sportid){
        Map positions = new HashMap<>()

        String query = "select * from pos_taking_model where group_id = "+sportid+" and user_id =(select id from user where name='"+username+"' limit 1)"
        System.out.println(query)
        try{
            openConnection()

            ResultSet rs = stmt.executeQuery(query)

            while (rs.next()) {
                positions.put("maxDownLinePosition", rs.getInt("max_dl_position"))
                positions.put("parentPosition", rs.getInt("parent_position"))
                positions.put("parentAutoPosition", rs.getInt("parent_auto_position"))
            }

            closeConnection()
        }catch (Exception e)
        {
            System.err.println(e.getMessage())
        }
        return positions
    }

    def Map<String,String> readCommissions(String username, int sportid){
        Map commission = new HashMap<>()

        String query = "select * from commission where commission_group_id = "+sportid+" and user_id =(select id from user where name='"+username+"' limit 1)"
        System.out.println(query)
        try{
            openConnection()

            ResultSet rs = stmt.executeQuery(query)

            while (rs.next()) {
                commission.put("memberCommission", rs.getBigDecimal("member_commission"))
                commission.put("commission", rs.getBigDecimal("commission"))
            }

            closeConnection()
        }catch (Exception e)
        {
            System.err.println(e.getMessage())
        }
        return commission
    }
    List getBetfairId(String username) {
        List list = []
        try {
            openConnection()

            String query = "select bet_fair_bet_id from bet_details where member_id=(select id from user where name='" + username + "') and bet_fair_bet_id is not null order by bet_fair_bet_id asc"
            ResultSet rs = stmt.executeQuery(query)
            while (rs.next()) {
                def id = rs.getLong("bet_fair_bet_id")
                list.add(id)
            }
            rs.close()

            closeConnection()
        }
        catch (Exception e) {
            System.out.println(e)
        }
        return list
    }
    Map getBets(String username) {
        def bets = [:]
        try {
            openConnection()

            String query = "select * from bet_details where member_id=(select id from user where name='" + username + "') and bet_fair_bet_id is not null order by bet_fair_bet_id asc"
            ResultSet rs = stmt.executeQuery(query)
            while (rs.next()) {
                def bet = [:]
                // we can add all the fields that we want
                bet.bet_num = rs.getLong("bet_num")
                bet.bet_fair_bet_id = rs.getLong("bet_fair_bet_id")
                bet.size = rs.getDouble("size")
                bet.size_matched = rs.getDouble("size_matched")
                bet.bet_status = rs.getInt("bet_status")
                bets[bet.bet_fair_bet_id.toString()] = bet
            }
            rs.close()

            closeConnection()
        }
        catch (Exception e) {
            System.out.println(e)
        }
        return bets
    }
    def deleteBets(String username) {
        try {
            openConnection()

            String query = "delete from bet_details where member_id=(select id from user where name='" + username + "')"
            stmt.execute(query)

        } catch (Exception e) {
            System.out.println(e)
        } finally {
            closeConnection()
        }
    }

    List getWhiteListedMarkets() {
        List list = []
        try {
            openConnection()

            String query = "select group_id from whitelisted_group"
            ResultSet rs = stmt.executeQuery(query)
            while (rs.next()) {
                def id = rs.getString("group_id")
                list.add(id)
            }
            rs.close()

            closeConnection()
        }
        catch (Exception e) {
            System.out.println(e)
        }
        return list
    }

    def getBetByBetfairId(String betfairId) {
        def bet = [:]
        try {
            openConnection()

            String query = "select * from bet_details where bet_fair_bet_id = '$betfairId'"
            ResultSet rs = stmt.executeQuery(query)
            while (rs.next()) {
                // we can add all the fields that we want
                bet.apolloBetId = rs.getLong("bet_num")
                bet.bet_fair_bet_id = rs.getLong("bet_fair_bet_id")
                bet.size = rs.getDouble("size")
                bet.size_matched = rs.getDouble("size_matched")
                bet.bet_status = rs.getInt("bet_status")
                bet.marketId = rs.getString("market_id")
                bet.selectionId = rs.getString("selection_id")
                bet.side = rs.getInt("side")
                bet.eventId = rs.getString("event_id")
                bet.price=rs.getString("price")
                bet.eventTypeId=rs.getString("event_type_id")
                bet.memberId=rs.getString("member_id")
                bet.totalSize = rs.getString("total_size")
            }
            rs.close()

            closeConnection()
        } catch(Exception e) {
            System.err.println(e.getMessage())
        }
        return bet
    }

    int getBetCount() {
        int count=0
        try {
            openConnection()
            String query = "select count(bet_fair_bet_id) as bet_fair_bet_id_count from bet_details"
            ResultSet rs = stmt.executeQuery(query)
            while (rs.next()) {
                count = rs.getInt("bet_fair_bet_id_count")
            }
            rs.close()

            closeConnection()
        } catch(Exception e) {
            System.err.println(e.getMessage())
        }
        return count
    }

}

