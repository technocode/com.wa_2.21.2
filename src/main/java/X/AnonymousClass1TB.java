package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.google.android.material.textfield.TextInputEditText;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.1TB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1TB implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ TextInputEditText A00;
    public final /* synthetic */ AnonymousClass05q A01;
    public final /* synthetic */ C46512At A02;

    public /* synthetic */ AnonymousClass1TB(C46512At r1, TextInputEditText textInputEditText, AnonymousClass05q r3) {
        this.A02 = r1;
        this.A00 = textInputEditText;
        this.A01 = r3;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        C46512At r7 = this.A02;
        TextInputEditText textInputEditText = this.A00;
        AnonymousClass05q r5 = this.A01;
        Calendar instance = Calendar.getInstance();
        instance.set(1, i);
        instance.set(2, i2);
        instance.set(5, i3);
        Date time = instance.getTime();
        String format = new SimpleDateFormat("dd/MM/yyyy", Locale.US).format(time);
        r7.A03 = format;
        if (time != null) {
            textInputEditText.setText(DateFormat.getDateInstance(1).format(time));
            AbstractC009505y r4 = r7.A01;
            if (r4 != null) {
                AnonymousClass1H3 r72 = new AnonymousClass1H3();
                r72.A00(0, format, true);
                r72.A00(1, new C463229b((double) i3), false);
                r72.A00(2, new C463229b((double) i2), false);
                r72.A00(3, new C463229b((double) i), false);
                C008805h.A0P(r4, new C010106g(r72.A00), r5);
                return;
            }
            return;
        }
        throw null;
    }
}
