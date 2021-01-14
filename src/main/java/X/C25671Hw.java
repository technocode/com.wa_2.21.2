package X;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.CountryPicker;

/* renamed from: X.1Hw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25671Hw implements AdapterView.OnItemClickListener {
    public final /* synthetic */ CountryPicker A00;

    public /* synthetic */ C25671Hw(CountryPicker countryPicker) {
        this.A00 = countryPicker;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CountryPicker countryPicker = this.A00;
        try {
            AnonymousClass1LK r3 = (AnonymousClass1LK) adapterView.getItemAtPosition(i);
            Intent intent = new Intent();
            intent.putExtra("country_name", r3.A01);
            intent.putExtra("cc", r3.A00);
            intent.putExtra("iso", r3.A03);
            countryPicker.setResult(-1, intent);
            countryPicker.finish();
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}
