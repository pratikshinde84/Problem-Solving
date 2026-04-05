import pandas as pd
df=pd.read_csv("practice.csv")
print(df.head())
ab=df.drop("prescription_required",axis=1)
print(ab.head())