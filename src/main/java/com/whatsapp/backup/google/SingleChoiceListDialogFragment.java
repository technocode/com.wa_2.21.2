package com.whatsapp.backup.google;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1QX;
import X.AnonymousClass1QY;
import X.AnonymousClass1R3;
import X.AnonymousClass1R4;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class SingleChoiceListDialogFragment extends WaDialogFragment {
    public AnonymousClass1R4 A00;
    public final AnonymousClass02M A01 = AnonymousClass02M.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0a(Context context) {
        super.A0a(context);
        try {
            this.A00 = (AnonymousClass1R4) context;
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append(" must implement SingleChoiceListListener");
            throw new ClassCastException(sb.toString());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        int length;
        int length2;
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2.containsKey("dialog_id")) {
            int i = bundle2.getInt("dialog_id");
            this.A03.set(false);
            AnonymousClass0MB r10 = new AnonymousClass0MB(A0A());
            String string = bundle2.getString("title");
            AnonymousClass0MC r9 = r10.A01;
            r9.A0I = string;
            r10.A07(this.A02.A06(R.string.cancel), null);
            if (bundle2.containsKey("items") && bundle2.containsKey("multi_line_list_items_key")) {
                throw new IllegalStateException("Cannot provide both items and multi_line_list_items_key");
            } else if (bundle2.containsKey("items") || bundle2.containsKey("multi_line_list_items_key")) {
                int i2 = bundle2.getInt("selected_item_index", -1);
                if (bundle2.containsKey("items")) {
                    String[] stringArray = bundle2.getStringArray("items");
                    AnonymousClass1QX r0 = new AnonymousClass1QX(this, i, bundle2);
                    r9.A0M = stringArray;
                    r9.A05 = r0;
                    r9.A00 = i2;
                    r9.A0L = true;
                } else if (bundle2.containsKey("multi_line_list_items_key")) {
                    ArrayList arrayList = new ArrayList();
                    String[] stringArray2 = bundle2.getStringArray("multi_line_list_items_key");
                    if (stringArray2 != null) {
                        String[] stringArray3 = bundle2.getStringArray("multi_line_list_item_values_key");
                        boolean[] booleanArray = bundle2.getBooleanArray("list_item_enabled_key");
                        String string2 = bundle2.getString("disabled_item_toast_key");
                        if (stringArray3 == null || (length = stringArray2.length) == (length2 = stringArray3.length)) {
                            for (int i3 = 0; i3 < stringArray2.length; i3++) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("line1", stringArray2[i3]);
                                hashMap.put("line2", stringArray3 != null ? stringArray3[i3] : null);
                                arrayList.add(hashMap);
                            }
                            AnonymousClass1R3 r14 = new AnonymousClass1R3(this, A00(), arrayList, new String[]{"line1", "line2"}, new int[]{16908308, 16908309}, booleanArray, i2, stringArray2);
                            AnonymousClass1QY r02 = new AnonymousClass1QY(this, booleanArray, i, stringArray2, string2);
                            r9.A0D = r14;
                            r9.A05 = r02;
                            r9.A00 = i2;
                            r9.A0L = true;
                        } else {
                            StringBuilder A0S = AnonymousClass008.A0S("keys.length = ");
                            A0S.append(length);
                            A0S.append(" ≠ ");
                            throw new IllegalArgumentException(AnonymousClass008.A0N(A0S, length2, " values.length"));
                        }
                    } else {
                        throw new IllegalArgumentException("Must provide multi_line_list_items_key");
                    }
                }
                return r10.A00();
            } else {
                throw new IllegalStateException("Must provide either items or multi_line_list_items_key");
            }
        } else {
            throw new IllegalStateException("dialog_id should be provided.");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void onDismiss(DialogInterface dialogInterface) {
        if (!((DialogFragment) this).A0C) {
            A0w(true, true);
        }
        Bundle bundle = ((AnonymousClass037) this).A06;
        if (this.A00 != null && !this.A03.get() && bundle.containsKey("dialog_id")) {
            this.A00.AF8(bundle.getInt("dialog_id"));
        }
    }
}
