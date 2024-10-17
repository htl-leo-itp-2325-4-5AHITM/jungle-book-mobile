package at.htlleonding.junglebook.journal

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JournalViewModel : ViewModel() {
    private var journals = MutableLiveData<MutableList<Journal>>()

    init {
        journals.value = mutableListOf()
    }

    fun addJournal(newJournal: Journal) {
        val list = journals.value
        list!!.add(newJournal)
        journals.postValue(list)
    }

    fun addJournals(newJournals: List<Journal>) {
        val list = journals.value
        list!!.addAll(newJournals)
        journals.postValue(list)
    }
}