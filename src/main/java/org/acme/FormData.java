/*package org.acme;
import java.util.Arrays;

public class FormData {
    public String product;
    public FormField[] formFields;

    public FormData() {
        // Public no-argument constructor
    }
	
	 @Override
    public String toString() {
        return "FormData{" +
                "product='" + product + '\'' +
                ", formattedFields=" + Arrays.toString(formFields) +
                '}';
    }
}
*/

package org.acme;

import java.util.Arrays;

public class FormData {
    public String product;
    public FormField[] formFields;

    public FormData() {
        // Public no-argument constructor
    }

    @Override
    public String toString() {
        return "{" +
                "\"product\":\"" + product + "\"," +
                "\"formFields\":" + Arrays.toString(formFields) +
                "}";
    }
}
