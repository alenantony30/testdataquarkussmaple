/*package org.acme;
import java.util.Map;

public class FormField {
    public String apiName;
   // public Map<String, String> requestBody;
   // public Map<String, String> responseBody;
   
   public String requestBody;
	public String responseBody;

    public FormField() {
        // Public no-argument constructor
    }
	
	@Override
public String toString() {
    return "FormattedField{" +
            "apiName='" + apiName + '\'' +
            ", requestBody=" + requestBody +
            ", responseBody=" + responseBody +
            '}';
}
}
*/

package org.acme;

public class FormField {
    public String apiName;
    public String requestBody;
    public String responseBody;

    public FormField() {
        // Public no-argument constructor
    }

    @Override
    public String toString() {
        return "{" +
                "\"apiName\":\"" + apiName + "\"," +
                "\"requestBody\":\"" + requestBody + "\"," +
                "\"responseBody\":\"" + responseBody + "\"" +
                "}";
    }
}
