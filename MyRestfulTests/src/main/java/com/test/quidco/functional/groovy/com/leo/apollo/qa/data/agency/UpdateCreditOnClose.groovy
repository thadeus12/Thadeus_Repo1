package com.test.quidco.functional.groovy.com.leo.apollo.qa.data.agency


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

/**
 * Created by Sudeep.Shenoy on 04/02/2016.
 */


When(~"I insert data for update credit on closure scenarios to database") { ->
    String password = 'OOI1Uw+wopA/XlO52boIUMVLwe84BgrriL77yIvYYZ0=$WtpvsNPpASDe8Bh2pAmc5HAUl8e0eipHuCotoDFDTN0='
    String creditlimits = '6000000,6000000,6000000,6000000,0,0,0,0,0,0'
    String besettings = '1,200,8000,13000'
    String postakings = '1,100,0,70'
    String commissions = '1,0,2'

    String basicinfo = "'coy.sm','" + password + "',1,0,0,1,'Test','COY','991',now(),1"
    creditlimits = '100000,100000,100000,100000,0,0,100000,0,0,0'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    int parent = db.getUserId("coy.sm")
    basicinfo = "'CC01','" + password + "',1,1,10,1,'Test','SMA','991',now(),1"
    creditlimits = '10000,10000,1000,5000,0,0,10000,0,0,0'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("CC01")
    basicinfo = "'CC0101','" + password + "',1," + parent + ",20,1,'Test','MA','991',now(),1"
    creditlimits = '5000,5000,1000,1000,0,0,10000,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("CC0101")
    basicinfo = "'CC010101','" + password + "',1," + parent + ",30,1,'Test','Agent','991',now(),1"
    creditlimits = '2000,0,1000,1000,0,0,10000,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("CC0101")
    basicinfo = "'CC010102','" + password + "',1," + parent + ",30,1,'Test','Agent','991',now(),1"
    creditlimits = '2000,0,1000,1000,0,0,10000,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("CC010101")
    basicinfo = "'CC010101M01','" + password + "',1," + parent + ",40,1,'Test','Member','991',now(),1"
    creditlimits = '1000,0,0,1000,0,0,1000,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,40'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("CC010102")
    basicinfo = "'CC010102M01','" + password + "',1," + parent + ",40,1,'Test','Member','991',now(),1"
    openbets=10
    creditlimits = '1000,0,0,1000,0,0,0,0,0,0,'+ openbets + ''
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,40'
    commissions = parent + ',0,2'
    db.createAgentWithOpenBets(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)
}

When(~"I delete data for update delete on close scenarios from database") { ->
    db.deleteAgent("coy.sm", "CC01", "CC0101", "CC010101", "CC010102","CC010101M01", "CC010102M01" )

}