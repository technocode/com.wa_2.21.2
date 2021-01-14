package com.whatsapp.backup.encryptedbackup;

import X.ActivityC004602e;
import X.AnonymousClass01X;
import X.AnonymousClass0S2;
import X.AnonymousClass1QK;
import X.AnonymousClass2C0;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CodeInputField;
import com.whatsapp.components.Button;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;

public class PasswordInputActivity extends ActivityC004602e {
    public CodeInputField A00;
    public Button A01;

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 200 && i2 == -1) {
            setResult(-1, new Intent());
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        setTitle(r5.A06(R.string.settings_gdrive_backup_password_protect_title));
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            setContentView(R.layout.activity_password_input);
            this.A00 = (CodeInputField) findViewById(R.id.activity_password_input_password_entry);
            Button button = (Button) findViewById(R.id.activity_password_input_next_button);
            this.A01 = button;
            boolean z = false;
            if (this.A00.length() >= 8) {
                z = true;
            }
            button.setEnabled(z);
            this.A00.requestFocus();
            ((TextView) findViewById(R.id.encrypted_backup_password_input_requirement)).setText(r5.A0D(R.string.encrypted_backup_password_input_requirement, 8));
            this.A00.addTextChangedListener(new AnonymousClass1QK(this));
            this.A01.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 24));
            return;
        }
        throw null;
    }
}
