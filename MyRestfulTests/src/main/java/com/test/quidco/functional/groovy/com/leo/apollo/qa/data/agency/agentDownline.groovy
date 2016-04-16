package com.test.quidco.functional.groovy.com.leo.apollo.qa.data.agency


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~"I insert data for Agent downline scenarios to database") { ->
    String password = 'OOI1Uw+wopA/XlO52boIUMVLwe84BgrriL77yIvYYZ0=$WtpvsNPpASDe8Bh2pAmc5HAUl8e0eipHuCotoDFDTN0='
    String creditlimits = '600000,500000,400000,600000,0,0,0,0,0,0'
    String besettings = '1,200,8000,13000'
    String postakings = '1,100,0,70'
    String commissions = '1,4,5'

    String basicinfo = "'AD01','" + password + "',1,1,10,1,'Test','SMA','991',now(),1"
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    int parent = db.getUserId("AD01")
    basicinfo = "'AD0101','" + password + "',1," + parent + ",20,1,'Test','MA','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',2,3'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    basicinfo = "'AD0102','" + password + "',1," + parent + ",20,4,'Closed','MA','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',2,3'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    basicinfo = "'AD0103','" + password + "',1," + parent + ",20,1,'Tes','MA','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',2,3'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)


    parent = db.getUserId("AD0101")
    basicinfo = "'AD010101','" + password + "',1," + parent + ",30,1,'Test','Agent','991',now(),1"
    creditlimits = '400000,300000,200000,400000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    basicinfo = "'AD010102','" + password + "',1," + parent + ",30,4,'Closed','Agent','991',now(),1"
    creditlimits = '400000,300000,200000,400000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)


    basicinfo = "'AD010103','" + password + "',1," + parent + ",30,1,'Test','Agent','991',now(),1"
    creditlimits = '400000,300000,200000,400000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("AD010101")
    basicinfo = "'AD010101M01','" + password + "',1," + parent + ",40,1,'Test','Member','991',now(),1"
    creditlimits = '200000,100000,90000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,0'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    basicinfo = "'AD010101M02','" + password + "',1," + parent + ",40,4,'Test','Member','991',now(),1"
    creditlimits = '200000,100000,90000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,0'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    basicinfo = "'AD010101M03','" + password + "',1," + parent + ",40,1,'Test','Member','991',now(),1"
    creditlimits = '200000,100000,90000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,0'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)
}

When(~"I delete data for Agent downline scenarios from database") { ->
    db.deleteAgent("AD01", "AD0101", "AD0102","AD0103","AD010101","AD010102","AD010103","AD010101M01","AD010101M02","AD010101M03")
}