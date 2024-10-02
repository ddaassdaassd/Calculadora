package com.example.calculadora4

import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.*

class MainActivity : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var button0: Button
    private lateinit var buttonSuma: Button
    private lateinit var buttonResta: Button
    private lateinit var buttonMultiplicacion: Button
    private lateinit var buttonDividir: Button
    private lateinit var buttonAC: Button
    private lateinit var buttonIgual: Button
    private lateinit var buttonSin: Button
    private lateinit var buttonCos: Button
    private lateinit var buttonTan: Button
    private lateinit var textViewResultado: TextView
    private lateinit var switchGR: Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var numero1 = ""
        var numero2 = ""
        var dobleOperacion = true
        var operacion = 0 //0-nada/1-suma/2-resta/3-multiplicacion/4-division
        var mensajeActualPantalla: String? = ""
        var estaEnGrados = true


        fun escrivirTextView(number: String, textView: TextView) {
            // Concatenar el nuevo número al texto actual
            mensajeActualPantalla += number

            // Mostrar el nuevo texto en el TextView
            textView.text = mensajeActualPantalla
        }
        fun borrartodo(textView: TextView) {
            // Borro el textView
            textView.text = ""
            mensajeActualPantalla = ""
        }
        fun calcular(num1: String, num2: String, opera: Int){
            if ((opera == 0) || (num1 == "") || (num2 == "")){
                borrartodo((textViewResultado))
                escrivirTextView("ERROR", textViewResultado)
                numero1 = ""
                numero2 = ""
                operacion = 0
            }
            else if (opera == 1){
                numero1 = (num1.toDouble() + num2.toDouble()).toString()
                numero2 = ""
                operacion = 0
            }
            else if (opera== 2){
                numero1 = (num1.toDouble() - num2.toDouble()).toString()
                numero2 = ""
                operacion = 0
            }
            else if (opera== 3){
                numero1 = (num1.toDouble() * num2.toDouble()).toString()
                numero2 = ""
                operacion = 0
            }
            else if (opera== 4){
                numero1 = (num1.toDouble() / num2.toDouble()).toString()
                numero2 = ""
                operacion = 0
            }
        }

        textViewResultado = findViewById(R.id.textViewResultado)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        button0 = findViewById(R.id.button0)
        buttonSuma = findViewById(R.id.buttonSuma)
        buttonResta = findViewById(R.id.buttonResta)
        buttonMultiplicacion = findViewById(R.id.buttonMultiplicacion)
        buttonDividir = findViewById(R.id.buttonDividir)
        buttonAC = findViewById(R.id.buttonAC)
        buttonIgual = findViewById(R.id.buttonIgual)
        buttonSin = findViewById(R.id.buttonSin)
        buttonCos = findViewById(R.id.buttonCos)
        buttonTan = findViewById(R.id.buttonTan)
        switchGR = findViewById(R.id.switchGR)

        button1.setOnClickListener {
            dobleOperacion = false
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            escrivirTextView("1", textViewResultado)
            if (operacion == 0){
                numero1 += "1"
            }
            else{
                numero2 += "1"
            }
        }
        button2.setOnClickListener {
            dobleOperacion = false
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            escrivirTextView("2", textViewResultado)
            if (operacion == 0){
                numero1 += "2"
            }
            else{
                numero2 += "2"
            }
        }
        button3.setOnClickListener {
            dobleOperacion = false
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            escrivirTextView("3", textViewResultado)
            if (operacion == 0){
                numero1 += "3"
            }
            else{
                numero2 += "3"
            }
        }
        button4.setOnClickListener {
            dobleOperacion = false
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            escrivirTextView("4", textViewResultado)
            if (operacion == 0){
                numero1 += "4"
            }
            else{
                numero2 += "4"
            }
        }
        button5.setOnClickListener {
            dobleOperacion = false
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            escrivirTextView("5", textViewResultado)
            if (operacion == 0){
                numero1 += "5"
            }
            else{
                numero2 += "5"
            }
        }
        button6.setOnClickListener {
            dobleOperacion = false
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            escrivirTextView("6", textViewResultado)
            if (operacion == 0){
                numero1 += "6"
            }
            else{
                numero2 += "6"
            }
        }
        button7.setOnClickListener {
            dobleOperacion = false
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            escrivirTextView("7", textViewResultado)
            if (operacion == 0){
                numero1 += "7"
            }
            else{
                numero2 += "7"
            }
        }
        button8.setOnClickListener {
            dobleOperacion = false
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            escrivirTextView("8", textViewResultado)
            if (operacion == 0){
                numero1 += "8"
            }
            else{
                numero2 += "8"
            }
        }
        button9.setOnClickListener {
            dobleOperacion = false
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            escrivirTextView("9", textViewResultado)
            if (operacion == 0){
                numero1 += "9"
            }
            else{
                numero2 += "9"
            }
        }
        button0.setOnClickListener {
            dobleOperacion = false
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            escrivirTextView("0", textViewResultado)
            if (operacion == 0){
                numero1 += "0"
            }
            else{
                numero2 += "0"
            }
        }
        buttonSuma.setOnClickListener {
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            if (dobleOperacion){
                mensajeActualPantalla = ""
                escrivirTextView("ERROR", textViewResultado)
                operacion = 0
                numero1 = ""
                numero2 = ""
                dobleOperacion = false
            }
            else{
                dobleOperacion = true
                escrivirTextView("+", textViewResultado)
                if (operacion == 0){
                    operacion = 1
                }
                else if (numero2 != ""){
                    calcular(numero1, numero2, operacion)
                    operacion = 1
                }
            }
        }
        buttonResta.setOnClickListener {
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            if (dobleOperacion){
                mensajeActualPantalla = ""
                escrivirTextView("ERROR", textViewResultado)
                operacion = 0
                numero1 = ""
                numero2 = ""
                dobleOperacion = false
            }
            else{
                dobleOperacion = true
                escrivirTextView("-", textViewResultado)
                if (operacion == 0){
                    operacion = 2
                }
                else if (numero2 != ""){
                    calcular(numero1, numero2, operacion)
                    operacion = 2
                }
            }
        }
        buttonMultiplicacion.setOnClickListener {
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            if (dobleOperacion){
                mensajeActualPantalla = ""
                escrivirTextView("ERROR", textViewResultado)
                operacion = 0
                numero1 = ""
                numero2 = ""
                dobleOperacion = false
            }
            else {
                dobleOperacion = true
                escrivirTextView("x", textViewResultado)
                if (operacion == 0) {
                    operacion = 3
                } else if (numero2 != "") {
                    calcular(numero1, numero2, operacion)
                    operacion = 3
                }
            }
        }
        buttonDividir.setOnClickListener {
            if (numero1 == ""){
                borrartodo(textViewResultado)
            }
            if (dobleOperacion){
                mensajeActualPantalla = ""
                escrivirTextView("ERROR", textViewResultado)
                operacion = 0
                numero1 = ""
                numero2 = ""
                dobleOperacion = false
            }
            else {
                dobleOperacion = true
                escrivirTextView("/", textViewResultado)
                if (operacion == 0) {
                    operacion = 4
                } else if (numero2 != "") {
                    calcular(numero1, numero2, operacion)
                    operacion = 4
                }
            }
        }
        switchGR.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // El Switch está en Radianes
                estaEnGrados = false
            } else {
                // El Switch está en Grados
                estaEnGrados = true
            }
        }
        buttonSin.setOnClickListener {
            if (numero1 != "" && operacion == 0){
                if (estaEnGrados){
                    numero1 = Math.toRadians(numero1.toDouble()).toString()
                }
                numero1= sin(numero1.toDouble()).toString()
                mensajeActualPantalla = ""
                escrivirTextView(numero1, textViewResultado)
                numero1 = ""
            }

        }
        buttonCos.setOnClickListener {
            if (estaEnGrados){
                numero1 = Math.toRadians(numero1.toDouble()).toString()
            }
            if (numero1 != "" && operacion == 0){
                numero1= cos(numero1.toDouble()).toString()
                mensajeActualPantalla = ""
                escrivirTextView(numero1, textViewResultado)
                numero1 = ""
            }
        }
        buttonTan.setOnClickListener {
            if (estaEnGrados){
                numero1 = Math.toRadians(numero1.toDouble()).toString()
            }
            if (numero1 != "" && operacion == 0){
                numero1= tan(numero1.toDouble()).toString()
                mensajeActualPantalla = ""
                escrivirTextView(numero1, textViewResultado)
                numero1 = ""
            }
        }

        buttonAC.setOnClickListener {
            borrartodo((textViewResultado))
            numero1 = ""
            numero2 = ""
            operacion = 0
            dobleOperacion = true
        }
        buttonIgual.setOnClickListener {
            mensajeActualPantalla = ""
            calcular(numero1, numero2, operacion)
            escrivirTextView(numero1, textViewResultado)
            numero1 = ""
            dobleOperacion = true
        }
    }
}