import pandas as pd
dataframe = pd.read_excel("../resources/Workers.xlsx")
print(dataframe)
print("Number of rows and colomns: ",dataframe.shape)
print("Data in emails column :", dataframe["Email"])
print("First name data in ascending order: ", dataframe.sort_values('FirstName'))

