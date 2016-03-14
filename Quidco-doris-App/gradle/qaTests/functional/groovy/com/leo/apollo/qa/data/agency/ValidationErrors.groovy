package com.leo.apollo.qa.data.agency


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~"I insert data for validation error scenarios to database") { ->
    String password = 'OOI1Uw+wopA/XlO52boIUMVLwe84BgrriL77yIvYYZ0=$WtpvsNPpASDe8Bh2pAmc5HAUl8e0eipHuCotoDFDTN0='
    String creditlimits = '600000,500000,400000,600000,0,0,0,0,0,0'
    String besettings = '1,200,8000,13000'
    String postakings = '1,100,0,70'
    String commissions = '1,4,5'

    String basicinfo = "'VE01','" + password + "',1,1,10,1,'Test','SMA','991',now(),1"
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    int parent = db.getUserId("VE01")
    basicinfo = "'VE0101','" + password + "',1," + parent + ",20,1,'Test','MA','991',now(),1"
    creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,60'
    commissions = parent + ',2,3'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("VE0101")
    basicinfo = "'VE010101','" + password + "',1," + parent + ",30,1,'Test','Agent','991',now(),1"
    creditlimits = '400000,300000,200000,400000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("VE010101")
    basicinfo = "'VE010101M01','" + password + "',1," + parent + ",40,1,'Test','Member','991',now(),1"
    creditlimits = '300000,200000,100000,300000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,40'
    commissions = parent + ',1,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

}

When(~"I delete data for validation error scenarios from database") { ->
    db.deleteAgent("VE01", "VE0101", "VE010101", "VE010101M01", "VE010101M02", "VE010101M03", "VE010101M04", "VE010101M05", "VE010101M06", "VE010101M07")
    db.deleteAgent("VE010101M08", "VE010101M09", "VE010101M10", "VE010101M11", "VE010101M12", "VE010101M13", "VE010101M14", "VE010101M15", "VE010101M16", "VE010101M17")
    db.deleteAgent("VE010101M18", "VE010101M19", "VE010101M20", "VE010101M21", "VE010101M22", "VE010101M23", "VE010101M24", "VE010101M25", "VE010101M216", "VE010101M27")
}
