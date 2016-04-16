package com.test.quidco.functional.groovy.com.leo.apollo.qa.data.agency


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~"I insert data for change password scenarios to database") { ->
    String password = 'OOI1Uw+wopA/XlO52boIUMVLwe84BgrriL77yIvYYZ0=$WtpvsNPpASDe8Bh2pAmc5HAUl8e0eipHuCotoDFDTN0='
    String creditlimits = '600000,500000,400000,600000,0,0,0,0,0,0'
    String besettings = '1,200,8000,0'
    String postakings = '1,100,0,70'
    String commissions = '0,0,2'


    basicinfo = "'coy.sm','" + password + "',1,0,0,1,'Test','COY','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,-500,0,0,0'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    String basicinfo = "'CP01','" + password + "',1,1,10,1,'Test','SMA','991',now(),1"
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    int parent = db.getUserId("CP01")
    basicinfo = "'CP0101','" + password + "',1," + parent + ",20,1,'Test','MA','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,0'
    postakings = parent + ',0,10,60'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)


    parent = db.getUserId("CP0101")
    basicinfo = "'CP010101','" + password + "',1," + parent + ",30,1,'Test','Agent','991',now(),1"
    creditlimits = '400000,300000,200000,400000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,0'
    postakings = parent + ',0,10,50'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)



}

When(~"I delete data for change password scenarios from database") { ->
    db.deleteAgent("coy.sm", "CP01", "CP0101", "CP010101")
}