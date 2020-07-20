package beanUtils的使用;

import lombok.*;

/**
 * @author james
 * @date 2020/7/13
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AA{

    private String str;


    public static void main(String[] args) {
        AA aa = AA.builder().build();
    }

}

