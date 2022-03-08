/**
Parse input json, find all entries, and return another json with values where
sum of digits in value field equal to 9.
Example:
Task08.parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}") == "{\"Kate\":18,\"Osvald\":27}"`
*/

package groovylab
import groovy.json.JsonSlurper
import groovy.json.JsonOutput

class Task08 {
    public static String parseAndFilterJson(String input) {
        def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText(input)
        def find = object.findAll{ it.value %9 == 0 }
        def jsonOutput = JsonOutput.toJson(find)
        return jsonOutput
    }
}
