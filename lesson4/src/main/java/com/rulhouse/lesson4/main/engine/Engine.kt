package com.rulhouse.lesson4.main.engine

import com.rulhouse.lesson4.main.licence.ComputerScienceLicence
import com.rulhouse.lesson4.main.licence.EngineeringLicence

open class Engine<T>(engineer: T) where T : EngineeringLicence, T : ComputerScienceLicence {
}