public class UserController {
    public String getList(Model model) {
        model.addAttribute("userlist", service.getUserList());
        return "user/list";
    }
    
    @SpringBootTest
    class UserControllerTest {
        @Test
        void test_getList() {
            // テストコードを記述
        }
    }
}