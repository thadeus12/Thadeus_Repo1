package com.leo.apollo.qa.data.agency


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~"I insert data for account balance scenarios to database") { ->
    String password = 'OOI1Uw+wopA/XlO52boIUMVLwe84BgrriL77yIvYYZ0=$WtpvsNPpASDe8Bh2pAmc5HAUl8e0eipHuCotoDFDTN0='
    String basicinfo = "'AV01','" + password + "',1,1,10,1,'Available','Balance','991',now(),1"
    String creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    String besettings = '1,100,10000,14000'
    String postakings = '1,0,10,60'
    String commissions = '0,0,2'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)
}
When(~"I delete data for account balance scenarios from database") { ->
    db.deleteAgent("AV01", "AV0101", "AV0102", "AV010101", "AV010102", "AV010101M01", "AV010101M02")
}
