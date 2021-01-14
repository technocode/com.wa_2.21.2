package com.whatsapp;

import X.AbstractC000400g;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01X;
import X.AnonymousClass0J8;
import X.AnonymousClass0JB;
import X.AnonymousClass0JW;
import X.AnonymousClass0M9;
import X.AnonymousClass0MH;
import X.AnonymousClass0S2;
import X.AnonymousClass1LQ;
import X.AnonymousClass1VM;
import X.AnonymousClass2C0;
import X.AnonymousClass3Y9;
import X.C000300f;
import X.C002101e;
import X.C006103b;
import X.C01970Ad;
import X.C02220Bc;
import X.C03190Fd;
import X.C04090Iz;
import X.C10300eP;
import X.C26401Ks;
import X.C28051Sr;
import X.C39481rb;
import X.C39941sM;
import X.C44221zh;
import X.C48802Nt;
import X.C49502Qs;
import X.C60562ph;
import X.C62962vd;
import X.C63532wa;
import X.C666835k;
import X.C68753Ek;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape0S0101000_I0;
import com.facebook.redex.ViewOnClickEBaseShape0S0200000_I0;
import com.google.android.search.verification.client.R;
import com.whatsapp.faq.SearchFAQ;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DescribeProblemActivity extends ActivityC004602e implements AnonymousClass0JB, AnonymousClass0J8 {
    public int A00;
    public EditText A01;
    public C48802Nt A02;
    public C10300eP A03;
    public C68753Ek A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public Uri[] A09 = new Uri[3];
    public final C26401Ks A0A = C26401Ks.A00();
    public final C04090Iz A0B = C04090Iz.A01;
    public final AnonymousClass00C A0C = AnonymousClass00C.A00();
    public final AnonymousClass0M9 A0D = AnonymousClass0M9.A01();
    public final AnonymousClass00Y A0E = AnonymousClass00Y.A00();
    public final C01970Ad A0F = C01970Ad.A00();
    public final C03190Fd A0G = C03190Fd.A00();
    public final C02220Bc A0H = C02220Bc.A00();
    public final AnonymousClass00T A0I = C002101e.A00();

    public final String A0T() {
        ArrayList<String> stringArrayListExtra;
        if (!getIntent().hasExtra("com.whatsapp.DescribeProblemActivity.description.paymentSupportTopicTitles") || (stringArrayListExtra = getIntent().getStringArrayListExtra("com.whatsapp.DescribeProblemActivity.description.paymentSupportTopicTitles")) == null || stringArrayListExtra.isEmpty()) {
            return AnonymousClass008.A0B(this.A01);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((AnonymousClass2C0) this).A01.A06(R.string.payments_support_email_topic_prefix));
        sb.append(" ");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        for (int i = 0; i < stringArrayListExtra.size(); i++) {
            sb2.append(stringArrayListExtra.get(i));
            if (i < stringArrayListExtra.size() - 1) {
                sb2.append(", ");
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("\n\n");
        A0S.append(this.A01.getText().toString().trim());
        sb2.append(A0S.toString());
        return sb2.toString();
    }

    public final void A0U() {
        List list;
        A0W(3, A0T());
        C26401Ks r4 = this.A0A;
        String str = this.A06;
        String str2 = this.A05;
        String str3 = this.A07;
        String A0T = A0T();
        Uri[] uriArr = this.A09;
        C68753Ek r0 = this.A04;
        if (r0 != null) {
            list = r0.A00();
        } else {
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Uri uri : uriArr) {
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        r4.A01(this, str, A0T, str2, str3, arrayList, list, null, true);
    }

    public final void A0V(int i, Uri uri) {
        this.A09[i] = uri;
        View findViewById = findViewById(R.id.screenshots);
        if (findViewById != null) {
            C60562ph r3 = (C60562ph) ((ViewGroup) findViewById).getChildAt(i);
            if (uri != null) {
                Point point = new Point();
                getWindowManager().getDefaultDisplay().getSize(point);
                int i2 = point.x / 3;
                try {
                    r3.setScreenshot(this.A0H.A06(uri, i2 / 2, i2));
                    r3.setContentDescription(((AnonymousClass2C0) this).A01.A06(R.string.describe_problem_screenshot));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("descprob/screenshot/io-exception ");
                    sb.append(uri);
                    Log.e(sb.toString(), e);
                    APo(R.string.error_load_image);
                    r3.setContentDescription(((AnonymousClass2C0) this).A01.A06(R.string.describe_problem_add_screenshot));
                } catch (C666835k e2) {
                    StringBuilder sb2 = new StringBuilder("descprob/screenshot/not-an-image ");
                    sb2.append(uri);
                    Log.e(sb2.toString(), e2);
                    APo(R.string.error_file_is_not_a_image);
                    r3.setContentDescription(((AnonymousClass2C0) this).A01.A06(R.string.describe_problem_add_screenshot));
                }
            } else {
                Bitmap bitmap = r3.A02;
                if (bitmap != null) {
                    bitmap.recycle();
                    r3.A02 = null;
                }
                r3.A02();
                r3.setContentDescription(((AnonymousClass2C0) this).A01.A06(R.string.describe_problem_add_screenshot));
            }
        } else {
            throw null;
        }
    }

    public final void A0W(int i, String str) {
        C44221zh r2 = new C44221zh();
        r2.A00 = Integer.valueOf(i);
        r2.A01 = str;
        r2.A02 = ((AnonymousClass2C0) this).A01.A04();
        this.A0E.A09(r2, 1);
        AnonymousClass00Y.A01(r2, "");
    }

    @Override // X.AnonymousClass0JB
    public void AFU() {
        this.A03 = null;
        A0U();
    }

    @Override // X.AnonymousClass0J8
    public void AJM(boolean z) {
        finish();
    }

    @Override // X.AnonymousClass0JB
    public void AJr(C49502Qs r13) {
        String str = this.A06;
        String str2 = r13.A02;
        ArrayList<? extends Parcelable> arrayList = r13.A05;
        String str3 = this.A07;
        int i = r13.A00;
        ArrayList<String> arrayList2 = r13.A06;
        ArrayList<String> arrayList3 = r13.A03;
        ArrayList<String> arrayList4 = r13.A07;
        ArrayList<String> arrayList5 = r13.A04;
        List list = r13.A08;
        Intent intent = new Intent(this, SearchFAQ.class);
        intent.putExtra("com.whatsapp.faq.SearchFAQ.from", str);
        intent.putExtra("com.whatsapp.faq.SearchFAQ.problem", str2);
        intent.putExtra("com.whatsapp.faq.SearchFAQ.status", str3);
        intent.putExtra("com.whatsapp.faq.SearchFAQ.count", i);
        intent.putStringArrayListExtra("com.whatsapp.faq.SearchFAQ.titles", arrayList2);
        intent.putStringArrayListExtra("com.whatsapp.faq.SearchFAQ.descriptions", arrayList3);
        intent.putStringArrayListExtra("com.whatsapp.faq.SearchFAQ.urls", arrayList4);
        intent.putStringArrayListExtra("com.whatsapp.faq.SearchFAQ.ids", arrayList5);
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        if (list != null) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                Pair pair = (Pair) list.get(i2);
                StringBuilder sb = new StringBuilder();
                sb.append((String) pair.first);
                sb.append(":");
                sb.append((String) pair.second);
                strArr[i2] = sb.toString();
            }
            intent.putExtra("com.whatsapp.faq.SearchFAQ.additionalDetails", strArr);
        }
        A0H(intent, 32);
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if ((i & 16) == 16) {
            if (i2 != -1) {
                return;
            }
            if (intent.getBooleanExtra("is_removed", false)) {
                A0V(i - 16, null);
                return;
            }
            Uri data = intent.getData();
            if (data != null) {
                try {
                    grantUriPermission("com.whatsapp", data, 1);
                } catch (SecurityException e) {
                    Log.w("descprob/permission", e);
                }
                A0V(i - 16, data);
                return;
            }
            APo(R.string.error_load_image);
        } else if (i != 32) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            finish();
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        A0W(1, null);
        super.onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02.A00();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: X.2vd */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        boolean z;
        C63532wa r10;
        super.onCreate(bundle);
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        setTitle(r5.A06(R.string.describe_problem_contact_support));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A092.A0B(true);
            setContentView(R.layout.describe_problem);
            View findViewById = findViewById(R.id.scroll_view);
            this.A01 = (EditText) findViewById(R.id.describe_problem_description_et);
            View findViewById2 = findViewById(R.id.describe_problem_error);
            Button button = (Button) findViewById(R.id.next_btn);
            boolean z2 = false;
            if (this.A01.getText().toString().length() >= 1) {
                z2 = true;
            }
            button.setEnabled(z2);
            this.A01.addTextChangedListener(new C39941sM(button));
            button.setOnClickListener(new ViewOnClickEBaseShape0S0200000_I0(this, findViewById2, 1));
            Intent intent = getIntent();
            this.A06 = intent.getStringExtra("com.whatsapp.DescribeProblemActivity.from");
            this.A07 = intent.getStringExtra("com.whatsapp.DescribeProblemActivity.serverstatus");
            this.A05 = intent.getStringExtra("com.whatsapp.DescribeProblemActivity.emailAddress");
            if (C28051Sr.A1x(this.A06)) {
                C000300f r4 = ((ActivityC004702f) this).A0G;
                C006103b r2 = AbstractC000400g.A4F;
                if (!TextUtils.isEmpty(r4.A09(r2))) {
                    this.A05 = r4.A09(r2);
                }
            }
            View findViewById3 = findViewById(R.id.screenshots);
            if (findViewById3 != null) {
                ViewGroup viewGroup = (ViewGroup) findViewById3;
                viewGroup.removeAllViews();
                if (C28051Sr.A1x(this.A06)) {
                    ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.whatsapp.DescribeProblemActivity.description.paymentSupportTopicIDs");
                    ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("com.whatsapp.DescribeProblemActivity.description.paymentSupportTopicTitles");
                    this.A04 = this.A0F.A03().A88();
                    String stringExtra = intent.getStringExtra("com.whatsapp.DescribeProblemActivity.paymentBankPhone");
                    AnonymousClass1VM r11 = (AnonymousClass1VM) intent.getParcelableExtra("com.whatsapp.DescribeProblemActivity.paymentMethod");
                    String stringExtra2 = intent.getStringExtra("com.whatsapp.DescribeProblemActivity.paymentFBTxnId");
                    String stringExtra3 = intent.getStringExtra("com.whatsapp.DescribeProblemActivity.paymentBankTxnId");
                    String stringExtra4 = intent.getStringExtra("com.whatsapp.DescribeProblemActivity.paymentErrorCode");
                    String stringExtra5 = intent.getStringExtra("com.whatsapp.DescribeProblemActivity.paymentStatus");
                    ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.payment_information_container);
                    C68753Ek r42 = this.A04;
                    if (r42 != null && !"payments:account-details".equals(this.A06)) {
                        r42.A02 = stringExtra2;
                        r42.A00 = stringExtra3;
                        r42.A01 = stringExtra4;
                        r42.A03 = stringExtra5;
                        r42.A04 = stringArrayListExtra;
                        if (!(r42 instanceof AnonymousClass3Y9)) {
                            C62962vd r102 = new C62962vd(this);
                            r102.setContactInformation(r42.A02);
                            r10 = r102;
                        } else {
                            C63532wa r103 = new C63532wa(this);
                            String str = r42.A02;
                            String str2 = r42.A00;
                            String string = r103.A03.A01().getString("payments_support_phone_number", null);
                            if (!TextUtils.isEmpty(string) && AnonymousClass0MH.A07(str)) {
                                r103.setWhatsAppContactDetails(string, str);
                                r10 = r103;
                            } else if (r11 != null && AnonymousClass0MH.A07(str2)) {
                                if (!TextUtils.isEmpty(stringExtra)) {
                                    String A0D2 = r103.A02.A0D(R.string.upi_contact_bank_with_name_and_phone_number, r11.A08, stringExtra, str2);
                                    SpannableString spannableString = new SpannableString(A0D2);
                                    URLSpan uRLSpan = new URLSpan(AnonymousClass008.A0K("tel:", stringExtra));
                                    int indexOf = A0D2.indexOf(stringExtra);
                                    spannableString.setSpan(uRLSpan, indexOf, stringExtra.length() + indexOf, 33);
                                    r103.A01.setText(spannableString);
                                } else {
                                    r103.A01.setText(r103.A02.A0D(R.string.upi_contact_support_for_payment, r11.A08, str2));
                                }
                                Bitmap A052 = r11.A05();
                                if (A052 != null) {
                                    r103.A00.setImageBitmap(A052);
                                    r103.A00.setVisibility(0);
                                }
                                r103.A01.setVisibility(0);
                                r10 = r103;
                            } else if (!TextUtils.isEmpty(string)) {
                                r103.setWhatsAppContactDetails(string, null);
                                r10 = r103;
                            } else {
                                r103.setVisibility(8);
                                r10 = r103;
                            }
                        }
                        viewGroup2.addView(r10);
                        viewGroup2.setVisibility(0);
                    }
                    TextView textView = (TextView) findViewById(R.id.optional_title);
                    if (stringArrayListExtra2 == null || stringArrayListExtra2.isEmpty()) {
                        textView.setVisibility(8);
                    } else {
                        StringBuilder sb = new StringBuilder(stringArrayListExtra2.get(0));
                        for (int i = 1; i < stringArrayListExtra2.size(); i++) {
                            if (i == 1) {
                                sb.append(" (");
                            }
                            sb.append(stringArrayListExtra2.get(i));
                            if (i == stringArrayListExtra2.size() - 1) {
                                sb.append(")");
                            } else {
                                sb.append(", ");
                            }
                        }
                        textView.setText(sb.toString());
                        textView.setVisibility(0);
                    }
                    View findViewById4 = findViewById(R.id.add_screenshots);
                    C68753Ek r0 = this.A04;
                    if (r0 != null) {
                        if (!(r0 instanceof AnonymousClass3Y9)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            findViewById4.setVisibility(8);
                            viewGroup.setVisibility(8);
                        }
                    }
                }
                int intExtra = intent.getIntExtra("com.whatsapp.DescribeProblemActivity.type", 0);
                this.A00 = intExtra;
                if (intExtra == 1 || intExtra == 2 || intExtra == 3) {
                    A092.A08(r5.A06(R.string.describe_problem_contact_us));
                } else {
                    A092.A08(r5.A06(R.string.describe_problem_contact_support));
                }
                String stringExtra6 = intent.getStringExtra("com.whatsapp.DescribeProblemActivity.description");
                if (stringExtra6 != null && stringExtra6.length() > 0) {
                    this.A01.setText(stringExtra6);
                    this.A08 = true;
                }
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.medium_thumbnail_padding);
                int i2 = 0;
                do {
                    C60562ph r7 = new C60562ph(this);
                    r7.setOnClickListener(new ViewOnClickEBaseShape0S0101000_I0(this, i2, 0));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    layoutParams.bottomMargin = dimensionPixelSize;
                    layoutParams.rightMargin = dimensionPixelSize;
                    layoutParams.topMargin = dimensionPixelSize;
                    layoutParams.leftMargin = dimensionPixelSize;
                    viewGroup.addView(r7, layoutParams);
                    String stringExtra7 = intent.getStringExtra("com.whatsapp.DescribeProblemActivity.uri");
                    if (i2 == 0 && stringExtra7 != null) {
                        Uri parse = Uri.parse(stringExtra7);
                        this.A09[0] = parse;
                        r7.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        r7.setImageURI(parse);
                    }
                    i2++;
                } while (i2 < 3);
                if (bundle != null) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("screenshots");
                    for (int i3 = 0; i3 < parcelableArray.length; i3++) {
                        if (parcelableArray[i3] != null) {
                            A0V(i3, (Uri) parcelableArray[i3]);
                        }
                    }
                }
                if (this.A00 == 2) {
                    A0U();
                }
                C48802Nt r1 = new C48802Nt(findViewById, findViewById(R.id.bottom_button_container), getResources().getDimensionPixelSize(R.dimen.settings_bottom_button_elevation));
                this.A02 = r1;
                r1.A00();
                this.A02.A02(this, (TextView) findViewById(R.id.describe_problem_help), r5.A06(R.string.describe_problem_help_center), new AnonymousClass1LQ(this), R.style.DescribeProblemInlineLink);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i != 2) {
            return super.onCreateDialog(i);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage(((AnonymousClass2C0) this).A01.A06(R.string.searching));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C10300eP r0 = this.A03;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(false);
        }
        C39481rb r02 = this.A0A.A00;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(false);
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        A0W(1, null);
        finish();
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A01.clearFocus();
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray("screenshots", this.A09);
    }
}
