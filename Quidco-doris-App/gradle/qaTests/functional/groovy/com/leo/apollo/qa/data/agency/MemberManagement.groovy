package com.leo.apollo.qa.data.agency


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~"I insert data for member management scenarios to database") { ->
    String password = 'OOI1Uw+wopA/XlO52boIUMVLwe84BgrriL77yIvYYZ0=$WtpvsNPpASDe8Bh2pAmc5HAUl8e0eipHuCotoDFDTN0='
    String creditlimits = '6000000,6000000,6000000,6000000,0,0,0,0,0,0'
    String besettings = '1,200,8000,13000'
    String postakings = '1,100,0,70'
    String commissions = '1,0,2'

    String basicinfo = "'ME01','" + password + "',1,1,10,1,'Test','SMA','991',now(),1"
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    int parent = db.getUserId("ME01")
    basicinfo = "'ME0101','" + password + "',1," + parent + ",20,1,'Test','MA','991',now(),1"
    creditlimits = '6000000,6000000,6000000,6000000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("ME0101")
    basicinfo = "'ME010101','" + password + "',1," + parent + ",30,1,'Test','Agent','991',now(),1"
    creditlimits = '6000000,6000000,6000000,6000000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("ME010101")
    basicinfo = "'ME010101M01','" + password + "',1," + parent + ",40,1,'Test','Member','991',now(),1"
    creditlimits = '70000,0,0,70000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,40'
    commissions = parent + ',0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

}

When(~"I delete data for member management scenarios from database") { ->
    db.deleteAgent("ME01", "ME0101", "ME010101", "ME010101M01", "ME010101M02", "ME010101M03", "ME010101M04", "ME010101M05", "ME010101M06", "ME010101M07")
    db.deleteAgent("ME010101M08", "ME010101M09", "ME010101M10", "ME010101M11", "ME010101M12", "ME010101M13", "ME010101M14", "ME010101M15", "ME010101M16", "ME010101M17")
    db.deleteAgent("ME010101M18", "ME010101M19", "ME010101M20", "ME010101M21", "ME010101M22", "ME010101M23", "ME010101M24", "ME010101M25", "ME010101M216", "ME010101M27")
}
