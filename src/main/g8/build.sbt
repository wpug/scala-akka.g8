name := "hello-akka"
version := "0.0.1"

scalaVersion := "2.13.10"
scalacOptions := Seq("-unchecked", "-deprecation", "-explaintypes", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.6.20"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "ch.qos.logback" % "logback-classic" % "1.3.7" % Runtime,
    //"ch.qos.logback" % "logback-classic" % "1.4.5" % Runtime, // for Java ver. >= 11
    "com.typesafe.akka" %% "akka-slf4j" % akkaV
  )
}
