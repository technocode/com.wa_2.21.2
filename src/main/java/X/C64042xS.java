package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.whatsapp.preference.WaFontListPreference;

/* renamed from: X.2xS  reason: invalid class name and case insensitive filesystem */
public class C64042xS extends BaseAdapter {
    public final /* synthetic */ WaFontListPreference A00;
    public final /* synthetic */ CharSequence[] A01;
    public final /* synthetic */ CharSequence[] A02;

    public long getItemId(int i) {
        return (long) i;
    }

    public C64042xS(WaFontListPreference waFontListPreference, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2) {
        this.A00 = waFontListPreference;
        this.A01 = charSequenceArr;
        this.A02 = charSequenceArr2;
    }

    public int getCount() {
        return this.A01.length;
    }

    public Object getItem(int i) {
        return this.A02[i];
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        WaFontListPreference waFontListPreference = this.A00;
        int i2 = 0;
        View inflate = LayoutInflater.from(waFontListPreference.getContext()).inflate(17367043, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(16908308);
        if (i == 0) {
            i2 = -1;
        } else if (i == 2) {
            i2 = 1;
        }
        textView.setTextSize(AbstractC51572Zg.A02(waFontListPreference.getContext().getResources(), waFontListPreference.A01, i2));
        textView.setText(this.A01[i]);
        return inflate;
    }
}
