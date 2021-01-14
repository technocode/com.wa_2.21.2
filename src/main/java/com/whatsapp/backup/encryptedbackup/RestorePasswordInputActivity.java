package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass0GE;
import X.AnonymousClass0S2;
import X.AnonymousClass1QL;
import X.AnonymousClass2C0;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.WaEditText;
import com.whatsapp.components.Button;

public class RestorePasswordInputActivity extends AnonymousClass0GE {
    public WaEditText A00;
    public Button A01;

    public RestorePasswordInputActivity() {
        super(false);
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass0GE, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.encrypted_backup_password_input_during_restore);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.activity_google_drive_restore_title));
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            A09.A0D(true);
        }
        this.A01 = (Button) findViewById(R.id.perform_restore);
        findViewById(R.id.dont_restore);
        WaEditText waEditText = (WaEditText) findViewById(R.id.encrypted_backup_restore_password_input);
        this.A00 = waEditText;
        Button button = this.A01;
        int length = waEditText.length();
        boolean z = false;
        if (length >= 8) {
            z = true;
        }
        button.setEnabled(z);
        this.A00.addTextChangedListener(new AnonymousClass1QL(this));
    }
}
