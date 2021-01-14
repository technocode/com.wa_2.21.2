package com.whatsapp.backup.encryptedbackup;

import X.ActivityC004602e;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0S2;
import X.AnonymousClass1MS;
import X.AnonymousClass1QG;
import X.AnonymousClass1QH;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C02300Bl;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

public class EncryptedBackupPhoneValidationActivity extends ActivityC004602e implements AnonymousClass1MS {
    public Button A00;
    public Button A01;
    public Button A02;
    public Button A03;
    public final C02300Bl A04 = C02300Bl.A00();

    @Override // X.AnonymousClass1MS
    public void AHV() {
        Button button = this.A02;
        Button button2 = this.A00;
        if (button == button2) {
            C002001d.A2O(this, 602);
        } else if (this.A03 == button2) {
            A0H(new Intent(this, PasswordInputActivity.class), 100);
            finish();
        } else if (this.A01 == button2) {
            A0H(new Intent(this, PasswordInputActivity.class), 101);
            finish();
        }
    }

    @Override // X.AnonymousClass1MS
    public void AHo() {
        APo(R.string.delete_account_mismatch);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        setTitle(r5.A06(R.string.settings_gdrive_backup_password_protect_title));
        setContentView(R.layout.encrypted_backup_phone_validation);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            TextView textView = (TextView) findViewById(R.id.encrypted_backup_enabled_phone_validation_description);
            findViewById(R.id.encrypted_backup_phone_validation_phone_label);
            C02300Bl r6 = this.A04;
            if (r6 != null) {
                textView.setText(r5.A0D(R.string.encrypted_backup_enabled_phone_validation_description, r5.A06(R.string.whatsapp_name)));
                AnonymousClass037 A06 = A04().A06(R.id.encrypted_backup_match_phone_number_fragment);
                if (A06 != null) {
                    this.A03 = (Button) findViewById(R.id.encrypted_backup_phone_enable);
                    this.A02 = (Button) findViewById(R.id.encrypted_backup_phone_disable);
                    this.A01 = (Button) findViewById(R.id.encrypted_backup_phone_change_password);
                    this.A03.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, A06, 7));
                    this.A02.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, A06, 8));
                    this.A01.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, A06, 9));
                    if (r6 != null) {
                        this.A02.setVisibility(8);
                        this.A01.setVisibility(8);
                        this.A03.setVisibility(0);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i != 602) {
            return super.onCreateDialog(i);
        }
        AnonymousClass0MB r3 = new AnonymousClass0MB(this);
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        String A06 = r2.A06(R.string.encrypted_backup_disable_dialog_title);
        AnonymousClass0MC r1 = r3.A01;
        r1.A0I = A06;
        r1.A0E = r2.A06(R.string.encrypted_backup_disable_dialog_message);
        r3.A07(r2.A06(R.string.encrypted_backup_disable_dialog_continue), new AnonymousClass1QH(this));
        r3.A05(r2.A06(R.string.cancel), new AnonymousClass1QG(this));
        return r3.A00();
    }
}
