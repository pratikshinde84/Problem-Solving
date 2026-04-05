import pandas as pd
df=pd.read_csv("medicine.csv")
print(df.head())
df.rename(columns={'generic_name':'Medicine_Name'},inplace=True)
print(df.head())

