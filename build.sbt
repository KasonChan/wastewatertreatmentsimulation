lazy val buildSettings = Seq(
  name := "wastewatertreatmentsimulation",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.11.7"
)

lazy val compilerOptions = Seq(
  "-encoding", "UTF-8",
  "-feature"
)

val testDependencies = Seq(
  "org.scalacheck" %% "scalacheck" % "1.12.5",
  "org.scalatest" %% "scalatest" % "2.2.5"
)

val baseSettings = Seq(
  libraryDependencies ++= Seq(
    "org.scala-lang.modules" %% "scala-swing" % "1.0.1"
  ) ++ testDependencies.map(_ % "test"),
  scalacOptions in(Compile, console) := compilerOptions
)

lazy val publishSettings = Seq(
  publishMavenStyle := true,
  publishArtifact := true,
  publishArtifact in Test := false,
  licenses := Seq("Apache 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")),
  pomExtra :=
    <developers>
      <developer>
        <id>KasonChan</id>
        <name>Kason Chan</name>
        <url>https://github.com/KasonChan</url>
      </developer>
    </developers>
)

lazy val noPublish = Seq(
  publish := {},
  publishLocal := {}
)

baseAssemblySettings

lazy val allSettings = baseSettings ++ buildSettings ++ publishSettings ++ baseAssemblySettings

assemblyJarName in assembly := "wastewatertreatmentsimulation.jar"

lazy val root = project.in(file("."))
  .settings(allSettings)
  .settings(noPublish)
