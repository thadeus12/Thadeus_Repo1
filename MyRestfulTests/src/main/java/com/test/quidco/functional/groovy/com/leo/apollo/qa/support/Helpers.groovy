package com.test.quidco.functional.groovy.com.leo.apollo.qa.support
import com.jayway.restassured.RestAssured
import com.jayway.restassured.mapper.ObjectMapper
import com.jayway.restassured.mapper.ObjectMapperDeserializationContext
import com.jayway.restassured.mapper.ObjectMapperSerializationContext
import com.jayway.restassured.response.Response
import com.sun.xml.internal.messaging.saaj.packaging.mime.internet.ContentType

class Helpers {

    Helpers() {
        RestAssured.baseURI = "http://localhost"
        RestAssured.port = 8081
        RestAssured.basePath = "/api"
    }

    static String loginAgencySite(String username, String password) {
        Response response =
                RestAssured.given().
                        body("{\"username\":\"" + username + "\",\"password\":\"" + password + "\",\"token\":\"dummytoken\",\"answer\":\"11111\"}").
                        contentType(ContentType.JSON).
                        when().
                        post("/auth/login").
                        then().
                        extract().
                        response()
        if (response.statusCode() == 200) {
            return response.header("Authorization")
        } else {
            return response.asString()
        }
    }

    static String loginMemberSite(String username, String password) {
        Response response =
                RestAssured.given().
                        body("{\"username\":\"" + username + "\",\"password\":\"" + password + "\",\"token\":\"dummytoken\",\"answer\":\"11111\"}").
                        contentType(ContentType.JSON).
                        when().
                        post("/auth/login").
                        then().
                        extract().
                        response()
        if (response.statusCode() == 200) {
            return response.header("Authorization")
        } else {
            return response.asString()
        }
    }

    static String loginCompanySite(String username, String password) {

        Response response =
                RestAssured.given().
                        body("{\"username\":\"" + username + "\",\"password\":\"" + password + "\"}").
                        contentType(ContentType.JSON).
                        when().
                        post("/auth/login").
                        then().
                        extract().
                        response()
        if (response.statusCode() == 200) {
            return response.header("Authorization")
        } else {
            return response.asString()
        }
    }

    static String createUser(String token, String json, String parent) {
        Response response =
                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        body(json).
                        when().
                        post("/agency/user/" + parent).
                        then().
                        extract().
                        response()
        return response.body().asString()
    }

    static String createSubUser(String token, String json) {
        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        body(json).
                        when().
                        post("/agency/subuser/admin.user").
                        then().
                        extract().
                        response()
        return response.body().asString()
    }

    static String updateUser(String token, String json, String username) {
        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        body(json).
                        when().
                        put("/agency/user/" + username).
                        then().
                        extract().
                        response()
        return response.body().asString()
    }

    static String transferBalance(String token, String username, String targetusercode, String json) {
        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        body(json).
                        when().
                        put("/agency/account/" + username + "/transfer/" + targetusercode + "/").
                        then().
                        extract().
                        response()
        return response.body().asString()
    }

    static String getAccountDetails(String token, String username) {
        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        when().
                        get("/agency/user/" + username + "/account").
                        then().
                        extract().
                        response()
        return response.body().asString()
    }
    static String coyGetAccountDetails(String token, String username) {
        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        when().
                        get("/agency/user/" + username + "/account").
                        then().
                        extract().
                        response()
        return response.body().asString()
    }
    static String getTransferDetails(String token, String username) {
        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        when().
                        get("/agency/account/transfer/" + username).
                        then().
                        extract().
                        response()
        return response.body().asString()
    }

    static String getDownlines(String token, String userCode,String searchCode, int statusCode) {

        String status = getStatus(statusCode)
        Response response =

                RestAssured.given().
                        header("Authorization", token).

                        when().
                        get("/agency/user/" + userCode + "/downline" + "?code=" + searchCode + "&status=" + status).
                        then().
                        statusCode(200).
                        extract().
                        response()
        return response.path("result.user.name").toString()
    }

    static String getDownlineFullDetails(String token, String userCode,String searchCode, int statusCode) {
        String status = getStatus(statusCode)
         Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        when().
                        get("/agency/user/" + userCode + "/downline" + "?code=" + searchCode + "&status=" + status).
                        then().
                        statusCode(200).
                        extract().
                        response()
        return response.body().asString()
    }

    static String getDownlineDetails(String token, String userCode) {

        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        when().
                        get("/agency/user/" + userCode + "/downline").
                        then().
                        statusCode(200).
                        extract().
                        response()
        return response.path("result[0]").toString()
    }

    static int forbidDownlineRequest(String token, String ownerUserCode) {

        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        when().
                        get("/agency/user/" + ownerUserCode + "/downline").
                        then().
                        statusCode(403).
                        extract().
                        response()
        return response.statusCode()
    }

    static String getAvailableSports() {

        Response response =

                RestAssured.given().
                        contentType(ContentType.JSON).
                        when().
                        get("/exchange/menu").
                        then().
                        statusCode(200).
                        extract().
                        response()
        return response.path("name").toString()
    }

    static String getAvailableMarkets(int marketid) {

        Response response =

                RestAssured.given().
                        contentType(ContentType.JSON).
                        when().
                        get("/exchange/market/"+marketid).
                        then().
                        statusCode(200).
                        extract().
                        response()
        return response.body().asString()
    }

    static String getStatus(int status){
        if(status == 1){
            return "ACTIVE"
        }else if (status == 2){
            return "INACTIVE"
        }else if (status == 3){
            return "SUSPENDED"
        }else if (status == 4){
            return "CLOSED"
        }else{
            return ""
        }
    }

    static String createUserJson(String userdata) {
        Map user = new HashMap<>()
        Map account = new HashMap<>()
        Map cricket = new HashMap<>()
        Map football = new HashMap<>()
        Map tennis = new HashMap<>()
        List<Map> bettings = new ArrayList<Map>()
        List<Map> positions = new ArrayList<Map>()
        List<Map> commissions = new ArrayList<Map>()
        Map data = new HashMap<>()

        String[] list = userdata.split(",", -1)
        String json = null
        bettings.clear()
        positions.clear()
        commissions.clear()
        user.clear()

        user.put("name", list[0])
        if (!list[1].equals("null")) {
            user.put("password", list[1])
        }
        user.put("master", list[2])
        user.put("level", list[3])
        user.put("status", list[4])
        user.put("firstName", list[5])
        user.put("lastName", list[6])
        user.put("contactNumber", list[7])


        account.clear()
        account.put("creditLimit", list[8])
        account.put("maxAgentCredit", list[9])
        account.put("maxMemberCredit", list[10])

        football.clear()
        football.put("sport", "Football")
        football.put("minBet", list[11])
        football.put("maxBet", list[12])
        football.put("maxPerMatch", list[13])
        bettings.add(football)

        cricket.clear()
        cricket.put("sport", "Cricket")
        cricket.put("minBet", list[11])
        cricket.put("maxBet", list[12])
        cricket.put("maxPerMatch", list[13])
        bettings.add(cricket)

        tennis.clear()
        tennis.put("sport", "Tennis")
        tennis.put("minBet", list[11])
        tennis.put("maxBet", list[12])
        tennis.put("maxPerMatch", list[13])
        bettings.add(tennis)

        Map pos1 = new HashMap<>()
        Map pos2 = new HashMap<>()
        Map pos3 = new HashMap<>()

        pos1.put("posTakingGroup", "FOOTBALL")
        pos1.put("parentAutoPosition", list[14])
        pos1.put("parentPosition", list[15])
        pos1.put("maxDownLinePosition", list[16])
        positions.add(pos1)

        pos2.put("posTakingGroup", "CRICKET")
        pos2.put("parentAutoPosition", list[14])
        pos2.put("parentPosition", list[15])
        pos2.put("maxDownLinePosition", list[16])
        positions.add(pos2)

        pos3.put("posTakingGroup", "TENNIS")
        pos3.put("parentAutoPosition", list[14])
        pos3.put("parentPosition", list[15])
        pos3.put("maxDownLinePosition", list[16])
        positions.add(pos3)

        Map com1 = new HashMap<>()
        Map com2 = new HashMap<>()
        Map com3 = new HashMap<>()

        com1.put("memberCommission", list[18])
        com1.put("commission", list[17])
        com1.put("group", "FOOTBALL")
        commissions.add(com1)

        com2.put("memberCommission", list[18])
        com2.put("commission", list[17])
        com2.put("group", "CRICKET")
        commissions.add(com2)

        com3.put("memberCommission", list[18])
        com3.put("commission", list[17])
        com3.put("group", "TENNIS")
        commissions.add(com3)

        data = new HashMap<>()
        data.put("personalInformation", user)
        data.put("creditLimits", account)
        data.put("betSettings", bettings)
        data.put("posTakings", positions)
        data.put("commissions", commissions)

        ObjectMapper mapper = new ObjectMapper()
        try {
            json = mapper.writeValueAsString(data)
        } catch (Exception ex) {
            System.out.println(ex)
        }
        return json;
    }

    static printdebug(String message){
        System.out.println("***********************************************************************************")
        System.out.println(message)
        System.out.println("***********************************************************************************")
    }

    static String getSubUsers(String token, String userCode) {
        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        when().
                        get("/agency/user/"+userCode+"/subusers").
                        then().
                        statusCode(200).
                        extract().
                        response()
        return response.path("result.name").toString()
    }

    static int rejectGetSubUsers(String token, String userCode) {
        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        when().
                        get("/agency/user/" + userCode + "/subusers").
                        then().
                        statusCode(403).
                        extract().
                        response()
        return response.statusCode()
    }

    static String changePassword(String token, String username, String password, String newpassword) {

        ObjectMapper mapper = new ObjectMapper()

        def dataObject = new HashMap<>()
        dataObject.put("oldPassword", password)
        dataObject.put("password", newpassword)
        def jsonBody = mapper.writeValueAsString(dataObject)


        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        body(jsonBody).
                        when().
                        put("/agency/user/" + username + "/password").
                        then().
                        extract().
                        response()
        return  response.body().asString()
    }

    static Response changePasswordAndGetHttpResponse(String token, String username, String password, String newpassword) {

        ObjectMapper mapper = new ObjectMapper() {
            @Override
            Object deserialize(ObjectMapperDeserializationContext objectMapperDeserializationContext) {
                return null
            }

            @Override
            Object serialize(ObjectMapperSerializationContext objectMapperSerializationContext) {
                return null
            }
        }
        //mapper = new ObjectMapper()

        def dataObject = new HashMap<>()
        dataObject.put("oldPassword", password)
        dataObject.put("password", newpassword)
        def jsonBody = mapper.writeValueAsString(dataObject)


        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        body(jsonBody).
                        when().
                        put("/agency/user/" + username + "/password").
                        then().
                        extract().
                        response()
        return  response
    }


    def createBetList(String bets){
        List<Map> betlist = new ArrayList<Map>()
        def data = bets.split(":")
        data.each{
            def bet = it.split(",")
            Map betmap = new HashMap<>()
            betmap.put("eventTypeId", bet[0])
            betmap.put("marketId", bet[1])
            betmap.put("selectionId", bet[2])
            betmap.put("side", bet[3])
            betmap.put("price", bet[4])
            betmap.put("totalSize", bet[5])
            betmap.put("memberId", bet[6])
            betmap.put("betSlipRef", bet[7])
            betlist.add(betmap)
        }
        return betlist;
    }

    static String placeBets(String token, List json) {
         Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        body(json).
                        when().
                        post("/exchange/order/").
                        then().
                        extract().
                        response()
        println response.asString()
        return  response.asString()
    }

    static String cancelBet(String token, String betNum) {
        Response response =

                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        when().
                        delete("/exchange/order/" + betNum).
                        then().
                        extract().
                        response()
        return response.asString()
    }

    def createMockResponse(String requestFolder, List<String> requestFiles){
        List<String> list =[]

        requestFiles.each { fileName ->
            def file = new File("src/functional/resources/jsons/" + requestFolder.trim() + "/" + fileName.trim() + ".json")
            String fileContents = file.getText('UTF-8')
            list.add(fileContents)
        }
        return list
    }

    static mockResponse(String responseType, List<String> responses) {
         Response response =

                RestAssured.given().
                        contentType(ContentType.JSON).
                        body(responses).
                        when().
                        post("/mock/set/"+responseType).
                        then().
                        statusCode(200).
                        extract().
                        response()
    }

    static String getpnl(String token, String username, String eventid) {
        Response response =
                RestAssured.given().
                        header("Authorization", token).
                        contentType(ContentType.JSON).
                        when().
                        get("/exchange/exposure/pnl/"+username+"/"+eventid).
                        then().
                        extract().
                        response()
        return response.body().asString()
    }
}
