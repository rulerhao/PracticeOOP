package com.rulhouse.lesson4.main.engine

import com.rulhouse.lesson4.main.engineer.Engineer
import com.rulhouse.lesson4.main.licence.ComputerScienceLicence
import com.rulhouse.lesson4.main.licence.EngineeringLicence
import com.rulhouse.lesson4.main.licence.SteamEngineLicence

class SteamEngine<T>(engineer: T): Engine<T>(engineer) where T : Engineer, T : ComputerScienceLicence, T : SteamEngineLicence {
}