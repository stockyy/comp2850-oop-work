// Task 7.7.2: contact database, using a map
fun getName(): String {
    // Prompt and input reading
    print("Enter a name (or 'x' to exit): ")
    val name = readln()
    // Return x if user would like to quit
    if (name == "x") {
        return "x"
    }
    // Confirming user choice
    print("Are you sure you would like to look up $name? (y/n)")
    val choice = readln().lowercase()
    // Return empty string if user chooses no
    if (choice == "n") {
        return ""
    }
    // Return name if user is happy with it
    else {
        return name
    }
}

// Returns the phone number a user enters for a person
fun getNumber(name: String): String {
    // Loop for user input
    while (true) {
        // prompt user
        print("Enter $name's number: ")
        // get input
        val phoneNumber = readln()
        // Ask user if number is correct
        print("Is $phoneNumber correct? (y/n)")
        val choice = readln().lowercase()
        if (choice == "y") {
            return phoneNumber
        }
        else {
            continue
        }
        }
}

// Takes in a name (key) and a map
// Prints a phone number (value) if it can find one
// Returns 0 for success and 1 for failure
fun nameSearch (name: String, contacts: Map<String, String>): Int {
    if (name in contacts.keys) {
        println("$name: %s".format(contacts[name]))
        return 0
    }
    else {
        return 1
    }
}

fun main() {
    // Define contacts
    val contacts = mutableMapOf (
        "Ned" to "07586900354",
        "Emma" to "07932511681",
        "Paul" to "07747707185",
        "Ollie" to "07508306087"
    )
    while (true) {
        val name = getName()
        // quit if user wants to exit program
        if (name == "x") {
            break
        }
        // skip to next iteration if user wants to re-enter name
        else if (name == "") {
            continue
        }
        // if the user entered a name
        else {
            // call nameSearch (which will print the name & contact number)
            // if nameSearch succeeeds, continue to next iteration
            if (nameSearch(name, contacts) == 0) {
                continue
            }
            // otherwise add name/number to contacts and move to next iteration
            else {
                contacts[name] = getNumber(name)
                continue
            }
        }
    }
}