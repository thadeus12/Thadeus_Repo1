package com.leo.apollo.qa.data.agency


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~"I insert data for agent login scenarios to database") { ->
    String password = 'OOI1Uw+wopA/XlO52boIUMVLwe84BgrriL77yIvYYZ0=$WtpvsNPpASDe8Bh2pAmc5HAUl8e0eipHuCotoDFDTN0='
    String creditlimits = '600000,500000,400000,600000,0,0,0,0,0,0'
    String besettings = '1,200,8000,13000'
    String postakings = '1,100,0,70'
    String commissions = '1,4,5'

    String basicinfo = "'AA15','" + password + "',1,1,10,4,'Closed','SMA','991',now(),1"
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    basicinfo = "'AA16','" + password + "',1,1,10,2,'Inactive','SMA','991',now(),1"
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    basicinfo = "'AA17','" + password + "',1,1,10,1,'Active','SMA','991',now(),1"
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    int parent = db.getUserId("AA15")
    basicinfo = "'AA1501','" + password + "',1," + parent + ",20,4,'Closed','MA','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',2,3'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("AA16")
    basicinfo = "'AA1601','" + password + "',1," + parent + ",20,2,'Inactive','MA','991',now(),1"
    creditlimits = '500000,500000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',2,3'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("AA1501")
    basicinfo = "'AA150101','" + password + "',1," + parent + ",30,4,'Closed','Agent','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("AA1601")
    basicinfo = "'AA160101','" + password + "',1," + parent + ",30,2,'Closed','Agent','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("AA15")
    basicinfo = "'AA1502','" + password + "',1," + parent + ",20,1,'Active','MA','991',now(),1"
    creditlimits = '500000,500000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',2,3'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("AA1501")
    basicinfo = "'AA150102','" + password + "',1," + parent + ",30,1,'Active','Agent','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("AA16")
    basicinfo = "'AA1602','" + password + "',1," + parent + ",20,1,'Active','MA','991',now(),1"
    creditlimits = '500000,500000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',2,3'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("AA1601")
    basicinfo = "'AA160102','" + password + "',1," + parent + ",30,1,'Active','Agent','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("AA17")
    basicinfo = "'AA1701','" + password + "',1," + parent + ",30,1,'Active','MA','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("AA1701")
    basicinfo = "'AA170101','" + password + "',1," + parent + ",30,1,'Active','MA','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)
}

When(~"I delete data for agent login scenarios from database") { ->
    db.deleteAgent("AA15", "AA1501", "AA1502", "AA150101", "AA150102", "AA16", "AA1601", "AA1602", "AA160101", "AA160102", "AA17", "AA1701", "AA170101")
}

