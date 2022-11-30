package models.lombok;

import lombok.Data;

public class UserCreationModel {


    @Data
    public class UserCretionResponseModel {

        private String name, job, id, createdAt;
    }
}
