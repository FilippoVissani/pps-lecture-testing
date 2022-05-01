package testLecture

import org.junit.platform.suite.api.{ConfigurationParameter, IncludeEngines, SelectClasspathResource, Suite}
// import io.cucumber.junit.platform.engine.Constants.{FILTER_TAGS_PROPERTY_NAME, GLUE_PROPERTY_NAME, PLUGIN_PROPERTY_NAME}
// Note: there's an issue with cucumber-junit-platform-engine

@Suite
@IncludeEngines(Array("cucumber","scalatest"))
@SelectClasspathResource("features/MyFeature.feature")
// @ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, "not @Wip")
@ConfigurationParameter(key = "cucumber.glue"/* GLUE_PROPERTY_NAME */, value = "testLecture.code.e4bdd.steps")
// @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty; html:target/cucumber/html")
class RunCucumberTests
