import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
import numpy as np
df = pd.read_csv("E:/Desktop/titanic.csv")

print(df.head())
sns.histplot(x='Age', data=df)
plt.show()