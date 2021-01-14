package com.whatsapp.group;

import X.AbstractC000400g;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import X.AnonymousClass2RZ;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;

public class GroupAddPrivacyActivity extends ActivityC004602e implements AnonymousClass2RZ {
    public int A00;
    public RadioButton A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public boolean A05 = false;
    public final AnonymousClass00D A06 = AnonymousClass00D.A00();

    public static void A04(GroupAddPrivacyActivity groupAddPrivacyActivity, int i) {
        if (groupAddPrivacyActivity == null) {
            throw null;
        } else if (i == 3) {
            Intent intent = new Intent(groupAddPrivacyActivity, GroupAddBlacklistPickerActivity.class);
            intent.putExtra("was_nobody", groupAddPrivacyActivity.A05);
            groupAddPrivacyActivity.startActivityForResult(intent, 1);
        } else {
            groupAddPrivacyActivity.A00 = i;
        }
    }

    public final void A0T() {
        RadioButton radioButton = this.A02;
        boolean z = false;
        boolean z2 = false;
        if (this.A00 == 1) {
            z2 = true;
        }
        radioButton.setChecked(z2);
        RadioButton radioButton2 = this.A01;
        boolean z3 = false;
        if (this.A00 == 0) {
            z3 = true;
        }
        radioButton2.setChecked(z3);
        RadioButton radioButton3 = this.A04;
        boolean z4 = false;
        if (this.A00 == 2) {
            z4 = true;
        }
        radioButton3.setChecked(z4);
        RadioButton radioButton4 = this.A03;
        if (this.A00 == 3) {
            z = true;
        }
        radioButton4.setChecked(z);
    }

    @Override // X.AnonymousClass2RZ
    public void A33() {
        Intent intent = new Intent();
        intent.putExtra("groupadd", this.A00);
        setResult(-1, intent);
        finish();
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                this.A00 = 3;
                Intent intent2 = new Intent();
                intent2.putExtra("groupadd", this.A00);
                setResult(-1, intent2);
                finish();
            }
            A0T();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.group_add_privacy);
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            boolean z = true;
            A09.A0A(true);
            AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
            A09.A08(r2.A06(R.string.settings_privacy_group_add_permissions));
            this.A02 = (RadioButton) findViewById(R.id.my_contacts_btn);
            this.A01 = (RadioButton) findViewById(R.id.everyone_btn);
            this.A04 = (RadioButton) findViewById(R.id.nobody_btn);
            this.A03 = (RadioButton) findViewById(R.id.my_contacts_except_btn);
            this.A02.setText(r2.A06(R.string.privacy_contacts));
            this.A01.setText(r2.A06(R.string.privacy_everyone));
            this.A04.setText(r2.A06(R.string.privacy_nobody));
            this.A03.setText(r2.A06(R.string.group_add_permission_blacklist));
            this.A02.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 7));
            this.A01.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 8));
            this.A04.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 9));
            this.A03.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 10));
            this.A00 = this.A06.A00.getInt("privacy_groupadd", 0);
            if (((ActivityC004702f) this).A0G.A0D(AbstractC000400g.A14)) {
                if (this.A00 != 2) {
                    z = false;
                }
                this.A05 = z;
                this.A04.setEnabled(false);
                if (this.A05) {
                    this.A04.setVisibility(0);
                } else {
                    this.A04.setVisibility(8);
                }
                this.A03.setVisibility(0);
            }
            A0T();
            findViewById(R.id.confirm_change_btn).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 11));
            return;
        }
        throw null;
    }
}
