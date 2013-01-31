Text Adventure
==============

An Android old-skool text adventure game. This is another exercise in TDD in an Android environment.

Backlog
=======

- [FEATURE] Add ability to look at inventory
  - [TEST] Touch events need to be release events, otherwise they trigger movement even on a long press (which we need for showing the context menu)
  - [TEST] View shows available room actions as a menu activated by tap centre of the screen
  - [TEST] View maps menu items to available actions upon selection
  - [TEST] Presenter tells view to display inventory upon receiving 'Show inventory' action. Inventory takes the form of actions list with 'look at {itemname}' type actions. Presenter calls view.actionChain( List<Action> )
- [FEATURE] Add ability to look at items in inventory
  - [TEST] Add default object in the inventory - 'Pocket Lint' and description 'It's fluffy and shaped like an inverted belly button'
  - [TEST] View responds to actionChain by immediately showing the advertised actions
  - [TEST] Presenter responds to 'Look at' action by appending item description to location description and calling view.showLocationDescription
- [REFACTOR]
  - [TEST] View/Presenter moveThroughExit interface should use 'Exit' actions instead of Exit objects directly and should use a common 'UserActionHandler::handleAction' interface
- [FEATURE] Add ability to pick up objects from the current room
  - [TEST] Presenter tells view that 'Pick up' action is available in rooms with objects in
  - [TEST] Pick up action has choices, i.e. the object to pick up. Upon triggering the action the presenter must tell the view what choices are available
  - [TEST] View tells presenter which object is chosen for pick up action
  - [TEST] Presenter adds object to user inventory
  - [TEST] Presenter removes object from room - state is persisted upon leaving and reentering room
- [FEATURE] Add ability to drop objects from the inventory into the current room

- Exit touch events don't seem to be quite right in the expected places...

- Add objects that can be examined to rooms
  - Pressing the centre of the screen gives a list of verbs, just 'examine' is available atm.
  - When user selects examine a list of objects in the room is given.
  - When the user chooses the object a description is shown.
  - The user can show the text for the room again by selecting 'examine' and choosing 'room'.

- Add other monsters, npcs

- Add other verbs - attack, eat, drink, dance, take, drop, give, talk

- Present verbs in a more accessible format - a wheel?

- Save progress
  - Add a menu on the Android menu key so the user can select 'save'.
  - Autosave

- Optional images to go with text?

Technical Tasks
===============

- Read the map from a text file for easy configurability.
- Read object data from a text file for easy configurability.
- Read npc/monster data from a text file for easy configurability.
- Improve build system so only necessary files are recompiled.
- Improve build system so only tests with changed source code are rerun.

