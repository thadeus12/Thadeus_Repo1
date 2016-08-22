name := "SELENIUMCUCUMBER-SCALATEST"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "2.53.1",
  "org.scalactic" %% "scalactic" % "3.0.0",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test",
  "org.scala-lang" % "scala-library" % "2.11.2",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.4",
  "info.cukes" % "cucumber-junit" % "1.2.4",
  "info.cukes" % "cucumber-picocontainer" % "1.2.4",
  "junit" % "junit" % "4.12" % "test"

)

    