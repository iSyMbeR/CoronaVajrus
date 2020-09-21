package kom.symber.koronavajrus.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class LocationStats {


     private int latestTotalCases;
     private String state;
     private String country;


}
