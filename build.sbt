name := "example-app"

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % "2.13.6",
  "com.typesafe.akka" %% "akka-actor" % "2.6.14"
)


enablePlugins(DebianPlugin)
maintainer := "Fatijon Tasholli <f.tasholli@contrader.group>"
packageSummary :="My custom package"
packageDescription := "Package"
