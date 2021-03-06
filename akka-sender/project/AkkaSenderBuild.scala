import sbt._
import sbt.Keys._

object AkkaSenderBuild extends Build {

  lazy val akkaSender = Project(
    id = "akka-sender",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Akka Sender",
      organization := "org.xikilze",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2",
      libraryDependencies ++= Seq(
        "org.clapper" %% "grizzled-slf4j" % "1.0.1",
        "ch.qos.logback" % "logback-classic" % "1.0.13",
        "org.codehaus.groovy" % "groovy-all" % "2.1.6",
        "com.typesafe.akka" %% "akka-actor" % "2.2.3",
        "com.typesafe.akka" %% "akka-remote" % "2.2.3",
        "com.typesafe.akka" %% "akka-slf4j" % "2.2.3"
      )
    )
  )
}
