package cglib处理;

/**
 * @author james
 * @date 2019/9/16
 */
public class UserDao implements IUserDao {

    @Override
    public void save() {
        System.out.println("已经保存数据...");
    }
}
