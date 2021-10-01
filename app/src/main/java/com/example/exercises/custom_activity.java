package com.example.exercises;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class custom_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_main2);
    }
}

    <?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#08173E"
        tools:context=".MainActivity3">

<TextView
        android:id="@+id/signinView2"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:fontFamily="@font/roboto_slab_bold"
                android:text="Custom"
                android:textColor="#FFFFFF"
                android:textSize="32sp"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintLeft_toLeftOf="parent"
                app:layout_constraintRight_toRightOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                app:layout_constraintVertical_bias="0.048" />

<ImageButton
        android:id="@+id/ava"
                android:layout_width="71dp"
                android:layout_height="73dp"
                android:layout_marginTop="16dp"
                android:layout_marginEnd="16dp"
                android:background="@drawable/ava"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.763"
                app:layout_constraintStart_toEndOf="@+id/signinView2"
                app:layout_constraintTop_toTopOf="parent"
                tools:ignore="SpeakableTextPresentCheck" />

<ImageButton
        android:id="@+id/backCustom"
                android:layout_width="48dp"
                android:layout_height="48dp"
                android:layout_marginTop="40dp"
                android:background="@drawable/ic_baseline_arrow_back_24"
                app:layout_constraintEnd_toStartOf="@+id/signinView2"
                app:layout_constraintHorizontal_bias="0.365"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toTopOf="parent"
                tools:ignore="SpeakableTextPresentCheck" />

<ImageButton
        android:id="@+id/tambah"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="100dp"
                android:background="@drawable/tambah"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.498"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/signinView2"
                tools:ignore="SpeakableTextPresentCheck" />

<ImageButton
        android:id="@+id/create"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:background="@drawable/create"
                android:minHeight="48dp"
                app:layout_constraintBottom_toBottomOf="parent"
                app:layout_constraintEnd_toEndOf="parent"
                app:layout_constraintHorizontal_bias="0.496"
                app:layout_constraintStart_toStartOf="parent"
                app:layout_constraintTop_toBottomOf="@+id/tambah"
                app:layout_constraintVertical_bias="0.106"
                tools:ignore="SpeakableTextPresentCheck" />
</androidx.constraintlayout.widget.ConstraintLayout>
