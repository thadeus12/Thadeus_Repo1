package com.leo.apollo.qa.data.agency

/**
 * Created by sudeep.shenoy on 12/01/2016.
 */



this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~"I insert data for transfer balance scenarios to database") { ->

    String password = 'OOI1Uw+wopA/XlO52boIUMVLwe84BgrriL77yIvYYZ0=$WtpvsNPpASDe8Bh2pAmc5HAUl8e0eipHuCotoDFDTN0='
    String creditlimits = '600000,500000,400000,600000,0,0,0,0,0,0'
    String besettings = '0,200,8000,13000'
    String postakings = '0,100,0,70'
    String commissions = '0,0,2'

    String basicinfo = "'coy.sm','" + password + "',1,0,0,1,'Test','COY','991',now(),1"
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)



    int parent = db.getUserId("coy.sm")
    basicinfo = "'SM07','" + password + "',1," + parent + ",10,1,'Test','SMA','991',now(),1"
    creditlimits = '1000000,1000000,1000000,1000000,0,0,0,0,2000,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("coy.sm")
    basicinfo = "'SM08','" + password + "',1," + parent + ",10,1,'Test','SMA','991',now(),1"
    creditlimits = '1000000,1000000,1000000,1000000,0,0,0,0,-1500,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("coy.sm")
    basicinfo = "'SM56','" + password + "',1," + parent + ",10,1,'Test','SMA','991',now(),1"
    creditlimits = '1000000,1000000,1000000,1000000,0,0,0,0,2000,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)


    parent = db.getUserId("SM56")
    basicinfo = "'SM5601','" + password + "',1," + parent + ",20,1,'Test','MA','991',now(),1"
    creditlimits = '80000,60000,50000,70000,0,0,0,0,-200,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("SM56")
    basicinfo = "'SM5602','" + password + "',1," + parent + ",20,1,'Test','MA','991',now(),1"
    creditlimits = '80000,60000,50000,70000,0,0,0,0,500,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("coy.sm")
    basicinfo = "'SM55','" + password + "',1," + parent + ",10,1,'Test','SMA','991',now(),1"
    creditlimits = '1000000,1000000,1000000,1000000,0,0,0,0,-2000,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("SM55")
    basicinfo = "'SM5501','" + password + "',1," + parent + ",20,1,'Test','MA','991',now(),1"
    creditlimits = '80000,60000,50000,70000,0,0,0,0,-500,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("SM55")
    basicinfo = "'SM5502','" + password + "',1," + parent + ",20,1,'Test','MA','991',now(),1"
    creditlimits = '80000,60000,50000,70000,0,0,0,0,-500,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("SM55")
    basicinfo = "'SM5503','" + password + "',1," + parent + ",20,1,'Test','MA','991',now(),1"
    creditlimits = '80000,60000,50000,70000,0,0,0,0,-500,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)


    parent = db.getUserId("SM5503")
    basicinfo = "'SM550301','" + password + "',1," + parent + ",30,1,'Test','AGENT','991',now(),1"
    creditlimits = '40000,0,20000,35000,0,0,0,0,-500,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,40'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)


    parent = db.getUserId("SM5503")
    basicinfo = "'SM550302','" + password + "',1," + parent + ",30,1,'Test','AGENT','991',now(),1"
    creditlimits = '35000,0,20000,35000,0,0,0,0,1000,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,40'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)


    parent = db.getUserId("SM550301")
    basicinfo = "'SM550301M01','" + password + "',1," + parent + ",40,1,'Test','MEMBER','991',now(),1"
    creditlimits = '20000,0,0,30000,0,0,0,0,1000,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,0,30'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("SM550301")
    basicinfo = "'SM550301M02','" + password + "',1," + parent + ",40,1,'Test','MEMBER','991',now(),1"
    creditlimits = '20000,0,0,10000,0,0,0,0,-1000,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,0,30'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)


    parent = db.getUserId("coy.sm")
    basicinfo = "'BT01','" + password + "',1," + parent + ",10,1,'Test','SMA','991',now(),1"
    creditlimits = '600000,500000,400000,50000,0,0,0,0,2000,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("BT01")
    basicinfo = "'BT0101','" + password + "',1," + parent + ",20,1,'Test','SMA','991',now(),1"
    creditlimits = '300000,200000,200000,25000,0,0,20000,20000,20000,20000'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

}

When(~"I delete data for balance transfer scenarios from database") { ->
    db.deleteAgent("SM55", "SM56", "SM07", "SM08", "coy.sm", "SM5601", "SM5602", "SM5501", "SM5502", "SM5503", "SM550301", "SM550301", "SM550302", "SM550301M01", "SM550301M02")
}