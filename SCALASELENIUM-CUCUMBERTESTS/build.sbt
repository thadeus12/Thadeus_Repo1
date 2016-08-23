name := "SCALASELENIUM-CUCUMBERTESTS"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.codeborne" % "phantomjsdriver" % "1.2.1",
  "org.seleniumhq.selenium" % "selenium-java" % "2.53.1",
  "org.seleniumhq.selenium" % "selenium-firefox-driver" % "2.53.1",
  "org.scala-lang" % "scala-library" % "2.11.7",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.4",
  "info.cukes" % "cucumber-junit" % "1.2.4",
  "info.cukes" % "cucumber-picocontainer" % "1.2.4",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"

)
