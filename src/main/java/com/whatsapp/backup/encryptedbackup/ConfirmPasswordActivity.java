package com.whatsapp.backup.encryptedbackup;

import X.ActivityC004602e;
import X.AnonymousClass0S2;
import X.AnonymousClass1QI;
import X.AnonymousClass1QJ;
import X.AnonymousClass2C0;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.components.Button;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;

public class ConfirmPasswordActivity extends ActivityC004602e {
    public CodeInputField A00;
    public AnonymousClass1QJ A01;
    public Button A02;
    public String A03;

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.settings_gdrive_backup_password_protect_title));
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            setContentView(R.layout.activity_confirm_password);
            this.A02 = (Button) findViewById(R.id.activity_confirm_password_done_button);
            CodeInputField codeInputField = (CodeInputField) findViewById(R.id.activity_confirm_password_input);
            this.A00 = codeInputField;
            codeInputField.requestFocus();
            Button button = this.A02;
            boolean z = false;
            if (this.A00.length() >= 8) {
                z = true;
            }
            button.setEnabled(z);
            this.A00.addTextChangedListener(new AnonymousClass1QI(this));
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                String string = extras.getString("password");
                if (string != null) {
                    this.A03 = string;
                } else {
                    throw null;
                }
            }
            this.A02.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 23));
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1QJ r0 = this.A01;
        if (r0 != null && !r0.isCancelled()) {
            this.A01.cancel(true);
        }
    }
}
