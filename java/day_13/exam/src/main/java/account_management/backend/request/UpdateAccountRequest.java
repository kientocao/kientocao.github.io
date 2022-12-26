package account_management.backend.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
public class UpdateAccountRequest {
        private String userName;
        private String email;
        private String passWord;

        public UpdateAccountRequest(String userName) {
            this.userName = userName;

        }
        public UpdateAccountRequest(String email, String userName){
            this.userName = userName;
            this.email = email;
        }
        public UpdateAccountRequest(String passWord,String userName,String email){
            this.passWord = passWord;
            this.email = email;
            this.userName = userName;
        }
}
