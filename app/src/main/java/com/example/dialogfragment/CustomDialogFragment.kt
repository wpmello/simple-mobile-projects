package com.example.dialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class CustomDialogFragment: DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater
            .inflate(R.layout.fragment_dialog_fragment, container, false)

        var cancelButton = rootView.findViewById<Button>(R.id.cancelButton)
        cancelButton.setOnClickListener {
            dismiss()
        }

        var submitButton = rootView.findViewById<Button>(R.id.submitButton)
        var ratingRadioGroup = rootView.findViewById<RadioGroup>(R.id.ratingRadioGroup)
        submitButton.setOnClickListener {
            val selectedId = ratingRadioGroup.checkedRadioButtonId
            val radio = rootView.findViewById<RadioButton>(selectedId)

            var ratingResult = radio.text.toString()

            Toast.makeText(context, "You rated: $ratingResult", Toast.LENGTH_LONG).show()

            dismiss()
        }

        return rootView
    }
}