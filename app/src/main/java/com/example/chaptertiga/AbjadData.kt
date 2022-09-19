package com.example.chaptertiga

object AbjadData{
    private val itemAbjads = arrayOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J" )

    val listAbjad: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in itemAbjads.indices) {
                val item = Abjad()
                item.huruf = itemAbjads[position]
                list.add(item)
            }
            return list
        }


    private val listA = arrayOf("abjad", "advokat", "adjektif",)
    val listAbjadA: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listA.indices) {
                val item = Abjad()
                item.huruf = listA[position]
                list.add(item)
            }
            return list
        }
    private val listB = arrayOf("barcode", "bonnadol", "brightvc")
    val listAbjadB: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listB.indices) {
                val item = Abjad()
                item.huruf = listB[position]
                list.add(item)
            }
            return list
        }
    private val listC = arrayOf("cooheart","chimonac","camila")
    val listAbjadC: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listC.indices) {
                val item = Abjad()
                item.huruf = listC[position]
                list.add(item)
            }
            return list
        }
    private val listD = arrayOf("dolar", "danau", "diagnosis")
    val listAbjadD: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listD.indices) {
                val item = Abjad()
                item.huruf = listD[position]
                list.add(item)
            }
            return list
        }
    private val listE = arrayOf("efektif", "elite", "efemeral")
    val listAbjadE: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listE.indices) {
                val item = Abjad()
                item.huruf = listE[position]
                list.add(item)
            }
            return list
        }
    private val listF = arrayOf("faksimile", "fahyong", "firts")
    val listAbjadF: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listF.indices) {
                val item = Abjad()
                item.huruf = listF[position]
                list.add(item)
            }
            return list
        }
    private val listG = arrayOf("griya", "gua", "gawin")
    val listAbjadG: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listG.indices) {
                val item = Abjad()
                item.huruf = listG[position]
                list.add(item)
            }
            return list
        }
    private val listH = arrayOf("hirarki","hari", "hakikat")
    val listAbjadH: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listH.indices) {
                val item = Abjad()
                item.huruf = listH[position]
                list.add(item)
            }
            return list
        }
    private val listI = arrayOf("indera", "inframerah", "inpitar")
    val listAbjadI: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listI.indices) {
                val item = Abjad()
                item.huruf = listI[position]
                list.add(item)
            }
            return list
        }
    private val listJ = arrayOf("jaylerr", "jobbiijob", "jadwal")
    val listAbjadJ: ArrayList<Abjad>
        get(){
            val list = arrayListOf<Abjad>()
            for (position in listJ.indices) {
                val item = Abjad()
                item.huruf = listJ[position]
                list.add(item)
            }
            return list
        }
}