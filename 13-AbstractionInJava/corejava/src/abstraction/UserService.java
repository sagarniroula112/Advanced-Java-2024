package abstraction;

import java.io.Serializable;
import java.util.List;

public interface UserService extends CommonService, Serializable, List<String> {
	void addUser();
	void deleteUser();
}
