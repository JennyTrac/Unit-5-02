# Created by Jenny Trac
# Created on Nov 16 2017
# Program accepts array and finds the largest value

import ui

def maximum(quantity, the_array = []):
    # determines the largest value in an array
    
    maximum_value = the_array[0]
    
    for every_number in the_array:
        if every_number > maximum_value:
            maximum_value = every_number
        else:
            maximum_value = maximum_value
    
    return maximum_value

def get_max_touch_up_inside(sender):
    # button to get max
    
    quantity_input = int(view['number_textfield'].text)
    array_input = (view['array_textfield'].text).split(' ')
    converted_array = [int(number) for number in array_input]
    # print quantity_input
    # print converted_array
    
    array_maximum = maximum(quantity_input, converted_array)
    
    view['answer_label'].text = str(array_maximum)

view = ui.load_view()
view.present('sheet')
