ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "assignments"
  )

lazy val helloCore = (project in file("core"))
  .settings(
    name := "Hello Core",
  )

lazy val hello = (project in file("hello"))
  .aggregate(helloCore)
  .dependsOn(helloCore)
  .settings(
    name := "Hello",
  )
