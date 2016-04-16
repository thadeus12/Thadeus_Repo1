package com.test.quidco.functional.groovy.com.leo.apollo.qa.data.agency


this.metaClass.mixin(cucumber.api.groovy.Hooks)
this.metaClass.mixin(cucumber.api.groovy.EN)

When(~"I insert data for update SMA scenarios to database") { ->
    String password = 'OOI1Uw+wopA/XlO52boIUMVLwe84BgrriL77yIvYYZ0=$WtpvsNPpASDe8Bh2pAmc5HAUl8e0eipHuCotoDFDTN0='
    String basicinfo = "'SM01','" + password + "',1,1,10,1,'Update','SMA','991',now(),1"
    String creditlimits = '500000,400000,300000,500000,0,0,0,0,0,0'
    String besettings = '1,100,10000,14000'
    String postakings = '1,100,0,60'
    String commissions = '1,4,5'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    int parent = db.getUserId("SM01")
    basicinfo = "'SM0101','" + password + "',1," + parent + ",20,1,'Test','MA','991',now(),1"
    creditlimits = '200000,150000,140000,200000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',4,5'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

}

When(~"I insert data for agent management scenarios to database") { ->
    String password = 'OOI1Uw+wopA/XlO52boIUMVLwe84BgrriL77yIvYYZ0=$WtpvsNPpASDe8Bh2pAmc5HAUl8e0eipHuCotoDFDTN0='
    String basicinfo = "'AM01','" + password + "',1,1,10,1,'Test','SMA','991',now(),1"
    String creditlimits = '5000000,4000000,3000000,5000000,0,0,0,0,0,0'
    String besettings = '1,100,10000,14000'
    String postakings = '1,0,10,60'
    String commissions = '1,4,5'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    int parent = db.getUserId("AM01")
    basicinfo = "'AM0101','" + password + "',1," + parent + ",20,1,'Agent','Management','991',now(),1"
    creditlimits = '5000000,4000000,3000000,5000000,0,0,20000,20000,20000,20000'
    besettings = parent + ',100,10000,14000'
    postakings = parent + ',0,0,60'
    commissions = parent + ',4,5'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("AM0101")
    basicinfo = "'AM010101','" + password + "',1," + parent + ",30,1,'Agent','Management','991',now(),1"
    creditlimits = '100000,0,90000,100000,0,0,20000,20000,20000,20000'
    besettings = parent + ',300,7000,12000'
    postakings = parent + ',0,10,40'
    commissions = parent + ',4,5'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

}

When(~"I insert data for create MA scenarios to database") { ->
    String password = 'OOI1Uw+wopA/XlO52boIUMVLwe84BgrriL77yIvYYZ0=$WtpvsNPpASDe8Bh2pAmc5HAUl8e0eipHuCotoDFDTN0='
    String basicinfo = "'MM01','" + password + "',1,1,10,1,'Test','SMA','991',now(),1"
    String creditlimits = '10000000,600000,500000,10000000,0,0,0,0,0,0'
    String besettings = '1,200,8000,13000'
    String postakings = '1,0,10,60'
    String commissions = '1,4,5'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)
}

When(~"I delete data for create MA scenarios from database") { ->
    db.deleteAgent("MM01", "MM0101", "MM0102", "MM0103", "MM0104", "MM0105", "MM0106", "MM0107", "MM0108", "MM0109", "MM0110", "MM0111", "MM0112", "MM0113", "MM0114", "MM0115")
}

When(~"I insert data for update MA scenarios to database") { ->
    String password = 'OOI1Uw+wopA/XlO52boIUMVLwe84BgrriL77yIvYYZ0=$WtpvsNPpASDe8Bh2pAmc5HAUl8e0eipHuCotoDFDTN0='
    String basicinfo = "'MM02','" + password + "',1,1,10,1,'Test','SMA','991',now(),1"
    String creditlimits = '200000,150000,140000,200000,0,0,0,0,0,0'
    String besettings = '1,200,8000,13000'
    String postakings = '1,0,10,60'
    String commissions = '1,4,5'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    int parent = db.getUserId("MM02")
    basicinfo = "'MM0201','" + password + "',1," + parent + ",20,1,'Update','MA','991',now(),1"
    creditlimits = '150000,140000,130000,150000,0,0,0,0,0,0'
    besettings = parent + ',200,8000,13000'
    postakings = parent + ',0,10,50'
    commissions = parent + ',2,3'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)

    parent = db.getUserId("MM0201")
    basicinfo = "'MM020101','" + password + "',1," + parent + ",30,1,'Test','Agent','991',now(),1"
    creditlimits = '120000,110000,100000,140000,0,0,0,0,0,0'
    besettings = parent + ',300,7000,12000'
    postakings = parent + ',0,10,40'
    commissions = parent + ',2,3'
    db.createAgent(basicinfo + "|" + creditlimits + "|" + besettings + "|" + postakings + "|" + commissions)
}
When(~"I delete data for update MA scenarios from database") { ->
    db.deleteAgent("MM02", "MM0201", "MM020101")
}
When(~"I delete data for agent management scenarios from database") { ->
    db.deleteAgent("AM01", "AM0101", "AM010101", "AM010102", "AM010103", "AM010104", "AM010105", "AM010106", "AM010107", "AM010108", "AM010109", "AM010110")
    db.deleteAgent("AM010111", "AM010112", "AM010113", "AM010114","AM010115","AM010116","AM010117","AM010118")
}

When(~"I delete data for update SMA scenarios from database") { ->
    db.deleteAgent("SM01", "SM0101")
}

When(~"I delete data for create SMA scenarios from database") { ->
    db.deleteAgent("SM01", "SM02", "SM03", "SM04", "SM05", "SM06", "SM07", "SM08", "SM09", "SM10", "SM11", "SM12", "SM13")
}