package com.whatsapp;

import X.AbstractC06100Rs;
import X.AbstractC06110Rt;
import X.AbstractC15630oP;
import X.AbstractC15640oQ;
import X.ActivityC004702f;
import X.ActivityC03630Ha;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass0MB;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S2;
import X.AnonymousClass0ZD;
import X.AnonymousClass1I4;
import X.AnonymousClass1I5;
import X.AnonymousClass1I6;
import X.AnonymousClass1I8;
import X.AnonymousClass1LX;
import X.AnonymousClass1LY;
import X.AnonymousClass1VY;
import X.AnonymousClass27K;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C004302a;
import X.C007003k;
import X.C014308b;
import X.C02590Cr;
import X.C15650oR;
import X.C28051Sr;
import X.C39971sP;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class DocumentPickerActivity extends ActivityC03630Ha implements AbstractC15630oP {
    public int A00 = 0;
    public MenuItem A01;
    public AbstractC06110Rt A02;
    public AnonymousClass1LX A03;
    public AnonymousClass02N A04;
    public String A05;
    public ArrayList A06;
    public List A07;
    public List A08;
    public boolean A09;
    public final AbstractC06100Rs A0A = new C39971sP(this);
    public final List A0B = new ArrayList();

    @Override // X.AbstractC15630oP
    public void AHG(C15650oR r1) {
    }

    public class SendDocumentsConfirmationDialogFragment extends WaDialogFragment {
        public final AnonymousClass01A A00 = AnonymousClass01A.A00();
        public final C014308b A01 = C014308b.A00();
        public final AnonymousClass03P A02 = AnonymousClass03P.A00();
        public final AnonymousClass01X A03 = AnonymousClass01X.A00();
        public final C02590Cr A04 = C02590Cr.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass01X r5;
            String A0A;
            AnonymousClass01A r2 = this.A00;
            AnonymousClass02N A012 = AnonymousClass02N.A01(((AnonymousClass037) this).A06.getString("jid"));
            if (A012 != null) {
                C007003k A0A2 = r2.A0A(A012);
                String A08 = this.A01.A08(A0A2, false);
                ArrayList parcelableArrayList = ((AnonymousClass037) this).A06.getParcelableArrayList("uri_list");
                if (parcelableArrayList != null) {
                    Boolean valueOf = Boolean.valueOf(((AnonymousClass037) this).A06.getBoolean("finish_on_cancel"));
                    if (valueOf != null) {
                        boolean booleanValue = valueOf.booleanValue();
                        String A05 = AnonymousClass0ZD.A05(this.A02, (Uri) parcelableArrayList.get(0));
                        if (AnonymousClass1VY.A0T(A0A2.A09) || A0A2.A09()) {
                            if (parcelableArrayList.size() != 1 || TextUtils.isEmpty(A05)) {
                                r5 = this.A03;
                                A0A = r5.A0A(R.plurals.group_confirm_send_documents_title, (long) parcelableArrayList.size(), Integer.valueOf(parcelableArrayList.size()), A08);
                            } else {
                                r5 = this.A03;
                                A0A = r5.A0D(R.string.group_confirm_send_document_title, A05, A08);
                            }
                        } else if (parcelableArrayList.size() != 1 || TextUtils.isEmpty(A05)) {
                            r5 = this.A03;
                            A0A = r5.A0A(R.plurals.confirm_send_documents_title, (long) parcelableArrayList.size(), Integer.valueOf(parcelableArrayList.size()), A08);
                        } else {
                            r5 = this.A03;
                            A0A = r5.A0D(R.string.confirm_send_document_title, A05, A08);
                        }
                        AnonymousClass0MB r22 = new AnonymousClass0MB(A0A());
                        r22.A01.A0E = C002001d.A1J(A0A, A00(), this.A04);
                        r22.A07(r5.A06(R.string.send), new AnonymousClass1I4(this, parcelableArrayList));
                        r22.A05(r5.A06(R.string.cancel), new AnonymousClass1I5(this, booleanValue));
                        return r22.A00();
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    public static void A04(DocumentPickerActivity documentPickerActivity) {
        if (documentPickerActivity.A03.getCount() == 0) {
            if (documentPickerActivity.A07 == null) {
                documentPickerActivity.findViewById(R.id.search_no_matches).setVisibility(8);
                documentPickerActivity.findViewById(R.id.progress).setVisibility(0);
            } else {
                ArrayList arrayList = documentPickerActivity.A06;
                if (arrayList == null || arrayList.isEmpty()) {
                    TextView textView = (TextView) documentPickerActivity.findViewById(R.id.search_no_matches);
                    textView.setVisibility(0);
                    textView.setText(((AnonymousClass2C0) documentPickerActivity).A01.A06(R.string.no_documents_found));
                    documentPickerActivity.findViewById(R.id.progress).setVisibility(8);
                } else {
                    TextView textView2 = (TextView) documentPickerActivity.findViewById(R.id.search_no_matches);
                    textView2.setVisibility(0);
                    textView2.setText(((AnonymousClass2C0) documentPickerActivity).A01.A0D(R.string.search_no_results, documentPickerActivity.A05));
                    documentPickerActivity.findViewById(R.id.progress).setVisibility(8);
                }
            }
            documentPickerActivity.findViewById(16908292).setVisibility(0);
            return;
        }
        documentPickerActivity.findViewById(16908292).setVisibility(8);
    }

    public final void A0V() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        A0H(intent, 1);
    }

    public final void A0W(AnonymousClass1LY r10) {
        List list = this.A0B;
        if (list.contains(r10)) {
            list.remove(r10);
            if (list.isEmpty()) {
                this.A02.A00();
            } else {
                this.A02.A01();
            }
        } else if (list.size() >= 30) {
            ((ActivityC004702f) this).A0F.A0C(C28051Sr.A0s(((AnonymousClass2C0) this).A01, 30), 0);
        } else {
            list.add(r10);
            this.A02.A01();
        }
        if (!list.isEmpty()) {
            C002001d.A2R(this, this.A0I, ((AnonymousClass2C0) this).A01.A0A(R.plurals.n_items_selected, (long) list.size(), Integer.valueOf(list.size())));
        }
        this.A03.notifyDataSetChanged();
    }

    public final void A0X(Collection collection) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.fromFile(((AnonymousClass1LY) it.next()).A02));
        }
        AnonymousClass02N r0 = this.A04;
        SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = new SendDocumentsConfirmationDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", r0.getRawString());
        bundle.putParcelableArrayList("uri_list", arrayList);
        bundle.putBoolean("finish_on_cancel", false);
        sendDocumentsConfirmationDialogFragment.A0N(bundle);
        sendDocumentsConfirmationDialogFragment.A0u(A04(), null);
    }

    @Override // X.AbstractC15630oP
    public C15650oR AEk(int i, Bundle bundle) {
        return new AnonymousClass27K(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r6.isEmpty() != false) goto L_0x0012;
     */
    @Override // X.AbstractC15630oP
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void AHA(X.C15650oR r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.util.List r6 = (java.util.List) r6
            r4.A07 = r6
            android.view.MenuItem r3 = r4.A01
            r2 = 1
            if (r3 == 0) goto L_0x0016
            if (r6 == 0) goto L_0x0012
            boolean r1 = r6.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r3.setVisible(r0)
        L_0x0016:
            java.lang.String r1 = r4.A05
            X.1LX r0 = r4.A03
            X.1LZ r0 = r0.A00
            r0.filter(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 19
            if (r1 < r0) goto L_0x0038
            java.util.List r0 = r4.A07
            if (r0 == 0) goto L_0x0033
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0038
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0038
        L_0x0033:
            r4.A09 = r2
            r4.A0V()
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DocumentPickerActivity.AHA(X.0oR, java.lang.Object):void");
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02s
    public void AKm(AbstractC06110Rt r3) {
        Toolbar toolbar = ((ActivityC004702f) this).A07;
        if (toolbar != null) {
            AnonymousClass0Q7.A0W(toolbar, 0);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C004302a.A00(this, R.color.primary_dark));
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02s
    public void AKn(AbstractC06110Rt r3) {
        Toolbar toolbar = ((ActivityC004702f) this).A07;
        if (toolbar != null) {
            AnonymousClass0Q7.A0W(toolbar, 4);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C004302a.A00(this, R.color.action_mode_dark));
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        Uri uri;
        super.onActivityResult(i, i2, intent);
        boolean z = true;
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            ClipData clipData = intent.getClipData();
            if (clipData != null) {
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    ClipData.Item itemAt = clipData.getItemAt(i3);
                    if (!(itemAt == null || (uri = itemAt.getUri()) == null)) {
                        arrayList.add(uri);
                    }
                }
            }
            if (arrayList.isEmpty() && (data = intent.getData()) != null) {
                arrayList.add(data);
            }
            if (!arrayList.isEmpty()) {
                Iterator<? extends Parcelable> it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        grantUriPermission("com.whatsapp", (Uri) it.next(), 1);
                    } catch (SecurityException e) {
                        Log.w("docpicker/permission ", e);
                    }
                }
                AnonymousClass02N r1 = this.A04;
                List list = this.A07;
                if (list != null && !list.isEmpty()) {
                    z = false;
                }
                SendDocumentsConfirmationDialogFragment sendDocumentsConfirmationDialogFragment = new SendDocumentsConfirmationDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putString("jid", r1.getRawString());
                bundle.putParcelableArrayList("uri_list", arrayList);
                bundle.putBoolean("finish_on_cancel", z);
                sendDocumentsConfirmationDialogFragment.A0N(bundle);
                sendDocumentsConfirmationDialogFragment.A0u(A04(), null);
            }
        } else if (i2 == 0) {
            List list2 = this.A07;
            if (list2 == null || list2.isEmpty()) {
                finish();
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.documents));
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            boolean z = true;
            A092.A0A(true);
            AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
            AnonymousClass00E.A04(A012, "rawJid is not a valid chat jid string");
            this.A04 = A012;
            AnonymousClass00D r0 = this.A0J;
            this.A00 = r0.A00.getInt("document_picker_sort", this.A00);
            setContentView(R.layout.document_picker);
            this.A03 = new AnonymousClass1LX(this);
            if (Build.VERSION.SDK_INT >= 19) {
                A0T().addHeaderView(getLayoutInflater().inflate(R.layout.document_picker_header, (ViewGroup) null, false));
            }
            A0U(this.A03);
            A0T().setOnItemClickListener(new AnonymousClass1I8(this));
            A0T().setOnItemLongClickListener(new AnonymousClass1I6(this));
            if (bundle == null || !bundle.getBoolean("system_picker_auto_started")) {
                z = false;
            }
            this.A09 = z;
            AbstractC15640oQ.A00(this).A01(0, null, this);
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0055, code lost:
        if (r1 != false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateOptionsMenu(android.view.Menu r5) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DocumentPickerActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_sort_by_name) {
            this.A00 = 0;
            this.A0J.A00.edit().putInt("document_picker_sort", 0).apply();
            invalidateOptionsMenu();
            this.A03.A00.filter(this.A05);
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_sort_by_date) {
            this.A00 = 1;
            this.A0J.A00.edit().putInt("document_picker_sort", 1).apply();
            invalidateOptionsMenu();
            this.A03.A00.filter(this.A05);
            return true;
        } else {
            if (menuItem.getItemId() == 16908332) {
                finish();
            }
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menuitem_sort_by_name);
        MenuItem findItem2 = menu.findItem(R.id.menuitem_sort_by_date);
        if (this.A00 == 0) {
            findItem.setChecked(true);
            return true;
        }
        findItem2.setChecked(true);
        return true;
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("system_picker_auto_started", this.A09);
    }

    @Override // X.ActivityC004902h
    public void startActivityForResult(Intent intent, int i) {
        try {
            super.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e) {
            Log.e("docpicker/pick-from-doc-provider ", e);
            ((ActivityC004702f) this).A0F.A06(R.string.activity_not_found, 0);
        }
    }
}
