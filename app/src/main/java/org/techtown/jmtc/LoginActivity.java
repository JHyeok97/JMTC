package org.techtown.jmtc;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText et_user;
    private Button btn_login;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("로그인");
        setContentView(R.layout.activity_login2);

        et_user = (EditText) findViewById(R.id.et_user);
        btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str_name = et_user.getText().toString();

                if("".equals(str_name)){
                    Toast.makeText(LoginActivity.this,"닉네임을 입력해주세요!",Toast.LENGTH_SHORT).show();;
                }
                else{
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    intent.putExtra("name",str_name);
                    startActivity(intent);
                }
            }
        });
    }
}