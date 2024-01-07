package kaoshi;

import dean.hirePerson;
import java.util.List;
import java.awt.*;

public interface HirePersonDAO {
    public hirePerson getHirePersonByNo(String hirePersonNum);

    public void insertHirePerson(hirePerson hireperson);
    public List<hirePerson> getHirePerson();
    public void updateAll(hirePerson h);
    public void deleteHirePerson(hirePerson h);
}
